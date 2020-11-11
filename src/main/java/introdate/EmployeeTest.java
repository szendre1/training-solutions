package introdate;

import java.util.Scanner;

public class EmployeeTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kérem az új dolgozó nevét: ");
        String newEmployeeName = scanner.nextLine();

        System.out.print("Kérem az új dolgozó születési évét: ");
        int newEmployeeYear = Integer.parseInt(scanner.nextLine());
        System.out.print("Kérem az új dolgozó születési hónapját: ");
        int newEmployeeMonth = Integer.parseInt(scanner.nextLine());

        System.out.print("Kérem az új dolgozó születési napját: ");
        int newEmployeeDay = Integer.parseInt(scanner.nextLine());

        Employee newWorker = new Employee(Integer.parseInt(scanner.nextLine()),newEmployeeMonth,newEmployeeDay, newEmployeeName);


        System.out.println("Az új dolgozó: "+newWorker.getName());
        System.out.println(newWorker.getDateOfBirth());
        System.out.println(newWorker.getBeginEmployment());


    }
}
