package week12d05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;

public class IndexReader {

    public int count(BufferedReader reader1, String read) throws IOException {
        int counter = 0;
        String line;
        //try (BufferedReader reader = Files.newBufferedReader(Path.of("index.txt"))) {
        while ((line = reader1.readLine()) != null) {
            if (line.toLowerCase().contains(read)) {
                counter++;
            }
            // System.out.println(line);
        }


        return counter;
    }
    // } catch (IOException e) {
    //         e.printStackTrace();
    //     }

    public static void main(String[] args) throws MalformedURLException {
        IndexReader indexReader = new IndexReader();
        Path file = Path.of("index.html");
        try (BufferedReader reader = Files.newBufferedReader(file)) {
            System.out.println(indexReader.count(reader, "koronavírus"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        IndexReader indexReader1 = new IndexReader();
        URL url = new URL("https://index.hu");
        try (BufferedReader urlReader = new BufferedReader(new InputStreamReader(url.openStream()))) {
            System.out.println(indexReader1.count(urlReader, "koronavírus"));
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
