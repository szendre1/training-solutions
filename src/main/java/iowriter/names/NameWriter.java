package iowriter.names;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class NameWriter {

    private Path file;

    public NameWriter(Path file) {
        this.file = file;
    }

    public void addAndWrite(String toFile) {
        try (BufferedWriter data = Files.newBufferedWriter(file, StandardOpenOption.APPEND)) {
            data.write(toFile + "\n");


        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}

