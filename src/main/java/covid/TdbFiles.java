package covid;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class TdbFiles {


    // Oltás Lista csv.be
    public void writeOltasLista(List<Citizen> oltasLista, BufferedWriter bufferedWriter) throws IOException {
        LocalTime oltasTime = LocalTime.of(7, 30);
        bufferedWriter.write("Időpont;Név;Irányítószám;Életkor;E-mail cím;TAJ szám\n");
        for (Citizen citizen : oltasLista) {
            oltasTime = oltasTime.plusMinutes(30);
            String towrite = oltasTime.toString() + ";" + citizen.getName() + ";" + citizen.getZip() + ";"
                    + citizen.getAge() + ";" + citizen.getEmail() + ";" + citizen.getTaj();
            System.out.println(towrite);
            bufferedWriter.write(towrite+"\n");

        }


    }


    // fájl beolvasás listába
    public List<Citizen> readfromBuffer(BufferedReader covidBuffer) throws IOException {
        List<Citizen> result = new ArrayList<>();
        String line = covidBuffer.readLine();
        while ((line = covidBuffer.readLine()) != null) {
            Citizen citizen = new Citizen();
            //String question = line;
            String lineArr[] = line.split(";");
            if (citizen.checkName(lineArr[0]) &&
                    citizen.checkZip(lineArr[1]) &&
                    citizen.checkAge(Integer.parseInt(lineArr[2])) &&
                    citizen.checkEmail(lineArr[3]) &&
                    citizen.checkTaj(lineArr[4])
            ) {
                citizen.setName(lineArr[0]);
                citizen.setZip(lineArr[1]);
                citizen.setAge(Integer.parseInt(lineArr[2]));
                citizen.setEmail(lineArr[3]);
                citizen.setTaj(lineArr[4]);
                result.add(citizen);
            } else {   // Kiírjuk a kezelhetetlen sorokat
                System.out.println("Érvénytelen adat: " + line);
            }
        }
        return result;
    }


}
