package stringscanner;

import java.util.Scanner;

public class StringScanner {

    public int readAndSumValues(String intString, String delimiter) {
        if (isEmpty(intString)) {
            throw new IllegalArgumentException("Incorrect parameter string!");
        }
        if (isEmpty(delimiter)) {
            delimiter = " ";
        }
        Scanner scanner = new Scanner(intString).useDelimiter(delimiter);
        if (!scanner.hasNextInt()) {
            throw new IllegalArgumentException("Incorrect parameter string!");
        }
        int sum = 0;
        while (scanner.hasNextInt()) {
            sum = sum + scanner.nextInt();
        }
        return sum;
    }

    public int readAndSumValues(String intString) {
        if (isEmpty(intString)) {
            throw new IllegalArgumentException("Incorrect parameter string!");
        }
        Scanner scanner = new Scanner(intString);
        if (!scanner.hasNextInt()) {
            throw new IllegalArgumentException("Incorrect parameter string!");
        }
        int sum = 0;
        while (scanner.hasNextInt()) {
            sum = sum + scanner.nextInt();
        }
        return sum;
    }

    public String filterLinesWithWordOccurrences(String text, String word) {
        if (isEmpty(text)) {
            throw new IllegalArgumentException("Incorrect parameter string!");
        }
        if (word == null || word.equals("")) {
            throw new IllegalArgumentException("Incorrect parameter string!");
        }
        Scanner scanner = new Scanner(text).useDelimiter(word);
        if (!scanner.hasNextLine()) {
            throw new IllegalArgumentException("Incorrect parameter string!");
        }
        String sum = "";
        while (scanner.hasNextLine()) {
            String x = scanner.nextLine();
            if (x.substring(x.length() - word.length()).equals(word)) {
                sum = sum + x + "\n";
            }
        }
        return sum.trim();
    }

    private boolean isEmpty(String s) {
        if ((s == null) || (s.trim().equals(""))) {
            return true;
        }
        return false;
    }

}
