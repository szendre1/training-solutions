package ioreader.idread;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class IdManager {
    private List<String> ids = new ArrayList<>();

    public void readIdsFromFile(String pathStr){

        List<String> employees = List.of("John Doe", "Jane Doe", "Jack Doe");
        Path file1 = Path.of("id2.txt");
        try (BufferedWriter writer = Files.newBufferedWriter(file1)) {
            for (String employee: employees) {
                writer.write(employee + "\n");
            }
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Can not write file", ioe);
        }




        Path file = Path.of(pathStr);
        try ( BufferedReader data = Files.newBufferedReader(file)){
            String line="";
            while( (line = data.readLine()) != null){
                ids.add(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<String> getIds() {
        return new ArrayList<>(ids);
    }
}
