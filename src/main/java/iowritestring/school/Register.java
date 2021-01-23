package iowritestring.school;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class Register {

    public void newMark(Path file, int jegy){

        try {
            if (!Files.exists(file)) {
                Files.writeString(file, ""+jegy+"\n");
            } else {
                Files.writeString(file, ""+jegy+"\n", StandardOpenOption.APPEND);
            }
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Can not write file", ioe);
        }

    }

    public void average(Path file){
        double average;
        try {
            List<String> jegyStr = Files.readAllLines(file);
            int sum=0;
            for (String j: jegyStr) {
                sum += Integer.parseInt(j);
            }
            average=(sum/ jegyStr.size());
            System.out.println(average);
            Files.writeString(file, "average: "+average, StandardOpenOption.APPEND);

        }
        catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }






    }


}
