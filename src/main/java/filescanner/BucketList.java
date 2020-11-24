package filescanner;

import java.util.Scanner;

public class BucketList {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(BucketList.class.getResourceAsStream("/Bucketlist.txt"))) {
            while(scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
        }
    }

}
