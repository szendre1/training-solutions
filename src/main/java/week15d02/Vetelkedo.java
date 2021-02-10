package week15d02;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.stream.Collectors;

public class Vetelkedo {
    private List<Feladat> feladatList = new ArrayList<>();

    public void readfromBuffer(BufferedReader vetelkedoBuffer) throws IOException {
        String line = null;
        while ((line = vetelkedoBuffer.readLine()) != null) {
            String question = line;
            line = vetelkedoBuffer.readLine();
            String lineArr[] = line.split(" ");
            String answer = lineArr[0];
            int point = Integer.parseInt(lineArr[1]);
            String subject = lineArr[2];
            feladatList.add(new Feladat(question, answer, point, subject));
        }
    }

    public List<String> subjectquestion(String subject) {
        // Szűrés feltételre  + csak a kérdés lista megy vissza
        List<String> result = feladatList.stream().filter(e -> e.getSubject().equals(subject))
                .map(Feladat::getQuestion)
                .collect(Collectors.toList());
        return result;
    }

    public Feladat randomquestion() {
        Random random = new Random(10);
        int rnd = random.nextInt(feladatList.size());
        return feladatList.get(rnd);
    }


    public Map<String, List<Feladat>> arrangedQuestonAndTopic() {
        Map<String, List<Feladat>> result = feladatList.stream()
                .sorted(Comparator.comparing(Feladat::getQuestion))
                .collect(Collectors.groupingBy(Feladat::getSubject));
        return result;
    }




    public static void main(String[] args) {
        Vetelkedo vetelkedo = new Vetelkedo();
        try (BufferedReader vetelkedoBuffeer = Files.newBufferedReader(Path.of("kerdesek.txt"))) {
            vetelkedo.readfromBuffer(vetelkedoBuffeer);
            List<String> subjectFeladatok = vetelkedo.subjectquestion("tortenelem");
            System.out.println("1. feladat:");
            subjectFeladatok.forEach(System.out::println);
            System.out.println();
            subjectFeladatok.forEach(s -> System.out.println(s));
            Feladat feladatRnd = vetelkedo.randomquestion();
            System.out.println("2. feladat:");
            System.out.println(feladatRnd);
            Map<String, List<Feladat>> result = vetelkedo.arrangedQuestonAndTopic();
            System.out.println();
            System.out.println("3. feladat:");
            result.forEach((key,value)-> System.out.println(key+":"+value));
            System.out.println();
            System.out.println("4. feladat:");
            result.forEach((key,value)-> System.out.println(key+":"+value.stream().collect(Collectors.summingInt(Feladat::getPoint))));


        } catch (IOException e) {
            throw new IllegalStateException("Illegal file path", e);
        }
    }
}
