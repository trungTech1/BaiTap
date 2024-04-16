package exercise1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordCount {
    public static void main(String[] args) {
        String fileName = "src/exercise1/data.txt";
        String content = readFile(fileName);
        int wordCount = countWords(content);

        System.out.println("Số lượng từ trong file: " + wordCount);
    }

    private static String readFile(String fileName) {
        StringBuilder content = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                content.append(line).append(" ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content.toString();
    }

    private static int countWords(String content) {
        String[] words = content.split("\\s+");
        return words.length;
    }
}
