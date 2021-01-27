package week13d03;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TeacherStatistics {

    private List<Teacher> teachers = new ArrayList<>();

    public void teachersReadFromFile(BufferedReader data) throws IOException {
        String line;
        String name;
        String subjecst;
        String classRoom;
        int tHours;
        while ((name = data.readLine()) != null) {
            subjecst = data.readLine();
            classRoom = data.readLine();
            line = data.readLine();
            tHours = Integer.parseInt(line);
            teachers.add(new Teacher(name, subjecst, classRoom, tHours));
        }
    }

    public int weekWork(String name) {
//        int sumHours=0;
//        for (Teacher t:teachers){
//            if (t.getName().equals(name)){
//                sumHours += t.gettHours();
//            }
//
//        }
//        return sumHours;
        return teachers.stream().filter(c -> c.getName().equals(name)).
                collect(Collectors.summingInt(Teacher::gettHours));
    }

    public static void main(String[] args) {
        TeacherStatistics tStat = new TeacherStatistics();
        Path file = Path.of("beosztas.txt");
        try {
            BufferedReader data = Files.newBufferedReader(file);
            tStat.teachersReadFromFile(data);
        } catch (IOException e) {
            throw new IllegalStateException("Bad file reading");
        }
        System.out.println("Albatrosz Aladin: " + tStat.weekWork("Albatrosz Aladin"));
        System.out.println("Antilop Anett: " + tStat.weekWork("Antilop Anett"));
        System.out.println("Csincsilla Csilla " + tStat.weekWork("Csincsilla Csilla"));
    }
}