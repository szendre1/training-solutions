package exam03;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Histogram {

    public void readFromBuffer(BufferedReader bufferedReader) throws IOException{
        String result = "";
        String line = null;
        while ((line = bufferedReader.readLine()) != null) {
            int stars=Integer.parseInt(line);
            for (int i = 0; i <stars ; i++) {
                result += "*";
            }
            result += "\n";
        }
        System.out.println(result);


    }


    public static void main(String[] args) {
        Histogram histogram = new Histogram();

        try (BufferedReader histogramBuffer = Files.newBufferedReader(Path.of("histogram.txt"))) {
            histogram.readFromBuffer(histogramBuffer);
        } catch (IOException e) {
            throw new IllegalStateException("Illegal file path", e);
        }
    }
}
