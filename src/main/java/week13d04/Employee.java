package week13d04;

import java.util.Arrays;
import java.util.List;

public class Employee {
    private String name;
    private List<Integer> birthYear;
    private More extend;

    public Employee(String name, List<Integer> birthYear, More extend) {
        this.name = name;
        this.birthYear = birthYear;
        this.extend = extend;
    }

    public Employee(Employee eOld) {
        this.name = eOld.getName();
        this.birthYear = eOld.birthYear;
        this.extend = new More(eOld.extend);
    }

    public More getEx() {
        return extend;
    }

    public void setEx(More extend) {
        this.extend = extend;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", birthYear=" + birthYear +
                ", extend=" + extend.getName() +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Integer> getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(List<Integer> birthYear) {
        this.birthYear = birthYear;
    }

    //    public static void main(String[] args) {
//        List<Employee> employees = Arrays.asList(
//                new Employee("ŐAAAA", 4),
//                new Employee("ÁBBBB", 3),
//                new Employee("ÉCCCC", 2)
//        );
//        Collections.sort(employees, new Comparator<Employee>() {
//            Collator spCollator = Collator.getInstance(new Locale("hu", "HU"));
//            @Override
//            public int compare(Employee o1, Employee o2) {
//
//                return o1.getName().compareTo(o2.getName());
//            }
//        });
//        System.out.println(employees);
//
//        Employee x= Collections.min(employees, new Comparator<Employee>() {
//            @Override
//            public int compare(Employee o1, Employee o2) {
//                return o1.birthYear - o2.birthYear;
//            }
//        });
//        System.out.println(x);
//    }

//    public static void main(String[] args) {
//        int[] i = {1, 3, 5, 6, 7, 9, 12, 4};
//        Arrays.sort(i);
//        int index = Arrays.binarySearch(i, 4);
//        System.out.println(index);
//
//        List<Integer> l = new ArrayList<>(Arrays.asList(1, 3, 5, 6, 7, 9, 12, 4));
//        Collections.sort(l);
//        index = Collections.binarySearch(l, 4);
//        System.out.println(Collections.max(l));
//        //System.out.println(index);
//    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Jack", Arrays.asList(1, 2, 3, 4, 5),new More("JJ"));
        Employee e2 = new Employee(e1);
        e1.setName("Xxxxx");
        e1.setBirthYear(Arrays.asList(5, 5, 5, 5, 5));
        e1.getEx().setName("KK");
        System.out.println(e1);
        System.out.println(e2);


    }

}
