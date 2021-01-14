package week11d04;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileSum {
    public int sumNumbers() {

        int readNumber=0;
        int sumNumber=0;

        String fileName;
        for (int actualFile = 0; actualFile < 100; actualFile++) {
            fileName = "number";
            if (actualFile < 10) {
                fileName += "0";
            }

            fileName += String.valueOf(actualFile) + ".txt";
            Path file = Path.of(fileName);
            System.out.println(file);
            try {
                if (Files.isRegularFile(file)) {
                    readNumber = Integer.parseInt(Files.readString(file));
                }
            } catch (IOException ioe) {
                throw new IllegalStateException("Can not read file", ioe);
            }

        sumNumber += readNumber;
        }

    return sumNumber;
    }

    public static void main(String[] args) {
        FileSum fileSum = new FileSum();
        System.out.println(fileSum.sumNumbers());
    }

}

