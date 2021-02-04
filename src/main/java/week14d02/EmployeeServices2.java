package week14d02;

import java.text.Collator;
import java.util.*;

public class EmployeeServices2 {

    private Collator huCollator = Collator.getInstance(new Locale("hu", "HU"));

    public List<Employee> sortByName(List<Employee> employees) {
        employees.sort(Comparator.comparing(Employee::getName,huCollator));
        return employees;
    }

    public List<Employee> sortBySalaryThanName(List<Employee> employees) {
        employees.sort(Comparator.comparingInt(Employee::getSalary).thenComparing(Employee::getName));
        return employees;
    }

    public List<Employee> sortByCardNumberNullFirstName(List<Employee> employees) {
        employees.sort(Comparator.comparing(Employee::getCardNumber,
                Comparator.nullsFirst(Comparator.naturalOrder()))
                .thenComparing(Employee::getName));
        return employees;
    }

    public List<Employee> sortByNameReversed(List<Employee> employees) {
        employees.sort(Comparator.comparing(employee -> employee.getName(), Comparator.reverseOrder()));
        //employees.sort(Comparator.comparing(Employee::getName,huCollator).reversed());
        return employees;
    }


    public static void main(String[] args) {
        EmployeeServices2 employeeServices2 = new EmployeeServices2();
        List<Employee> employees = new ArrayList<>(Arrays.asList(
                new Employee("Ádám", 10, "Á888"),
                new Employee("István", 20, "A444"),
                new Employee("Józsi", 20, null),
                new Employee("Arnold", 20, "I111")));

        System.out.println(employeeServices2.sortByNameReversed(employees));


    }

}
