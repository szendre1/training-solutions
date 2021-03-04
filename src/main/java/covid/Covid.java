package covid;

import org.flywaydb.core.Flyway;
import org.mariadb.jdbc.MariaDbDataSource;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

public class Covid {


    public void regisztracio(){
        System.out.println("*****************************");
        System.out.println("*** Regisztráció oltásra  ***");
        System.out.println("*****************************");
        System.out.println("Kérem a regisztrálandó személy adatait:");
        TbdDao tbdDao = new TbdDao();
        MariaDbDataSource dataSource = new MariaDbDataSource();
        dataSource = tbdDao.setDatasource(dataSource);
        Scanner scanner = new Scanner(System.in);
        Citizen citizen = new Citizen();
        Boolean next= Boolean.FALSE;
        do {
            System.out.print("Kérem a nevet: ");
            String name = scanner.nextLine();
            next = citizen.checkName(name);
            if (next){
                citizen.setName(name);
            }
        } while (!next);
        do {
            System.out.print("Kérem az irányítószámot: ");
            String zip = scanner.nextLine();
            next = citizen.checkZip(zip);
            if (next){
                System.out.print("Település: ");
                System.out.println(tbdDao.readCity(zip,dataSource));
                citizen.setZip(zip);
            }
        } while (!next);
        do {
            System.out.print("Kérem az életkort: ");
            int age = scanner.nextInt();
            scanner.nextLine();
            next = citizen.checkAge(age);
            if (next){
                citizen.setAge(age);
            }
        } while (!next);
        do {
            System.out.print("Kérem az email címet: ");
            String email = scanner.nextLine();
            next = citizen.checkEmail(email);
            if (next){
                citizen.setEmail(email);
            }
        } while (!next);
        do {
            System.out.print("Kérem a taj számot! ");
            String taj = scanner.nextLine();
            next = citizen.checkTaj(taj);
            if (next){
                citizen.setTaj(taj);
            }
        } while (!next);
        System.out.println("Rögzythetem a várólistára? [I/N]");
        String ansver = scanner.nextLine();
        if (ansver.toUpperCase().equals("I")){
            //TbdDao tbdDao = new TbdDao();
            tbdDao.insertData(citizen,dataSource);
            System.out.println("Rögzítve!");
        } else {
            System.out.println("Rögzítés törölve!");
            return;
        }
    }


public void tomegesregisztracio(){
    System.out.println("*************************************");
    System.out.println("*** Tömeges regisztráció oltásra  ***");
    System.out.println("*************************************");
    Scanner scanner = new Scanner(System.in);
    System.out.println("Kérem a beolvasandó fájl nevét! Pl: covid.csv");
    String filename = scanner.nextLine();
    if (!(filename.substring(filename.length()-4,filename.length()).equals(".csv"))){
        filename += ".csv";
    }

    TbdDao tbdDao = new TbdDao();
    MariaDbDataSource dataSource = new MariaDbDataSource();
    dataSource = tbdDao.setDatasource(dataSource);
    TdbFiles tdbFiles = new TdbFiles();

    try (BufferedReader covidBuffeer = Files.newBufferedReader(Path.of(filename))) {
        List<Citizen> result = tdbFiles.readfromBuffer(covidBuffeer);
        //result.stream().forEach(System.out::println);
        tbdDao.insertDataList(result, dataSource);
    } catch (IOException e) {
        throw new IllegalStateException("Illegal file path", e);
    }
    System.out.println("Adatok beolvasva!");
    }


    public void generalas(){
        System.out.println("******************************");
        System.out.println("*** Oltás lista generálás  ***");
        System.out.println("******************************");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérem a település irányítószamat:       Teszt: 2061");
        String zip=scanner.nextLine();
        Citizen citizen = new Citizen();
        if(!citizen.checkZip(zip)){
            System.out.println("Érvénytelen irányítószám!");
            return;
        }
        TbdDao tbdDao = new TbdDao();
        MariaDbDataSource dataSource = new MariaDbDataSource();
        dataSource = tbdDao.setDatasource(dataSource);

        System.out.print("Település: ");
        System.out.println(tbdDao.readCity(zip,dataSource));
        System.out.println();
        List<Citizen> citizensZip = tbdDao.readData(zip, dataSource);
        System.out.println("Zip:");
        // citizensZip.stream().forEach(System.out::println);
        System.out.println("Eredmény: oltáslista"+zip+".csv");
        TdbFiles tdbFiles = new TdbFiles();
        try (BufferedWriter covidBuffeerWr = Files.newBufferedWriter(Path.of("oltasLista"+zip+".csv"))) {
            tdbFiles.writeOltasLista(citizensZip, covidBuffeerWr);
        } catch (IOException e) {
            throw new IllegalStateException("Illegal file path", e);
        }
    }


    public void menu() {
        //Covid covid = new Covid();
        while (true) {
            System.out.println("***************************************************");
            System.out.println("1. Regisztráció");
            System.out.println("2. Tömeges regisztráció");
            System.out.println("3. Generálás");
            System.out.println("4. Oltás");
            System.out.println("5. Oltás meghiúsulás");
            System.out.println("6. Riport");
            System.out.println("0. Kilépés");
            System.out.println();
            Scanner scanner = new Scanner(System.in);
            String menu = scanner.nextLine();
            if (menu.equals("")){
                menu = "z";
            }
            if (menu.substring(0,1).equals("0")){
                return;
            }
            if (menu.substring(0,1).equals("1")){
                regisztracio();
            }
            if (menu.substring(0,1).equals("2")){
                tomegesregisztracio();
            }
            if (menu.substring(0,1).equals("3")){
                generalas();
            }

        }
    }


    public static void main(String[] args) {

        //adatbázis beállítás
        TbdDao tbdDao = new TbdDao();
        MariaDbDataSource dataSource = new MariaDbDataSource();
        dataSource = tbdDao.setDatasource(dataSource);

        Flyway flyway = Flyway.configure().dataSource(dataSource).load();
        flyway.clean();
        flyway.migrate();







        Covid covid= new Covid();
        covid.menu();


    }
}
