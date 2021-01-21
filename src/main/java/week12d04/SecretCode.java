package week12d03;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class SecretCode {

    List<Integer> integerList = new ArrayList<>();

    public void integerFromFile() {
        Path file = Path.of("c:\\temp360\\secret.dat");
        //try (BufferedReader reader = Files.newBufferedReader(file)) {
        try (InputStream inputStream = Files.newInputStream(file)) {

            byte[] bytes = new byte[1000];
            int size;
            while ((size = inputStream.read(bytes)) > 0) {
                for (byte b : bytes) {
                    System.out.print((char) (b + 10));
                }
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }


    public static void main(String[] args) {
        SecretCode secretcode = new SecretCode();
        secretcode.integerFromFile();
    }

}
