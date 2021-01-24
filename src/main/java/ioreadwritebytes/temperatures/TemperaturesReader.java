package ioreadwritebytes.temperatures;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class TemperaturesReader {

    public Temperatures readTemperatures(String pathString){
        byte data[] = new byte[0];
        Path file = Path.of(pathString);
        try {
            data = Files.readAllBytes(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new Temperatures(data);
    }

}
