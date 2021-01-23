package ioreadstring.names;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class FileManager {
    Path path;
    List<Human> humans = new ArrayList<>();


    public FileManager(String path) {
        this.path = Path.of(path);
    }

    public Path getMyFile(){
        return path;
    }

    public void readFromFile() {
        List<String> names;
        try {
            names = Files.readAllLines(path);
            for (String n: names) {
                String name[]= n.split(" ");
                humans.add(new Human(name[0],name[1]));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Human> getHumans(){
        return humans;
    }
}
