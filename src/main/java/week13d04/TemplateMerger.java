package week13d04;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class TemplateMerger {

    public void merge(Path file, List<Employee> employees2) {
        try {
            BufferedReader data = Files.newBufferedReader(file);
            employeeReadFromBuffer(data, employees2);
        } catch (IOException e) {
            throw new IllegalStateException("Bad file reading");
        }
        //return employees;
    }

    public void employeeReadFromBuffer(BufferedReader data, List<Employee> employees1) throws IOException {
        String line;
        while ((line = data.readLine()) != null) {
//            String[] employeInfo1 = line.split("\\{");
//            String[] name = employeInfo1[1].split("\\}");
//            String[] year = employeInfo1[2].split("\\}")
//            System.out.println(name[0]+" "+year[0]);

            String name = line.substring(line.indexOf("{") + 1, line.indexOf("}"));
            //System.out.println(name);
            int start = line.indexOf("}") + 1;
            String yearStr = line.substring(line.indexOf("{", start) + 1, line.indexOf("}", start));
            int year = Integer.parseInt(yearStr);
            //System.out.println(year);
          //  employees1.add(new Employee(name, year));
        }
        //return employees;
    }

    public void writeEmployees(List<Employee> employees) {
        System.out.println(employees);
        for (Employee e : employees) {
            System.out.println("Az alkalmazott neve: " + e.getName() + ", születési éve: " + e.getBirthYear());
        }
    }

    public static void main(String[] args) {
        List<Employee> employees;
        employees = new ArrayList<>();
        Path file = Path.of("employees.txt");
        TemplateMerger templateMerger = new TemplateMerger();
        templateMerger.merge(file, employees);
        templateMerger.writeEmployees(employees);
    }


}
