package credit.ex12;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileWithText {

    public static void main(String[] args) throws IOException {

        String line;
        int wordCount = 0;
        int punctuationMarksCount = 0;


        BufferedReader br = new BufferedReader(new FileReader(".\\src\\credit\\ex12\\file.txt"));

        while ((line = br.readLine()) != null) {
            line = line.trim().replaceAll("\\s+", " ");
            String[] words = line.split("[\\s\\W]+");
            wordCount = wordCount + words.length;
        }
        System.out.println("Количество слов в тексте: " + wordCount);
        br.close();

        BufferedReader br2 = new BufferedReader(new FileReader(".\\src\\credit\\ex12\\file.txt"));

        while ((line = br2.readLine()) != null) {
            line = line.replaceAll("\\s+","").trim();
            String[] array = line.split("");

            for (String i : array) {
                if (i.matches("\\W")) {
                    punctuationMarksCount++;
                }
            }
        }
        System.out.println();
        System.out.println("Количество знаков пунктуации: " + punctuationMarksCount);
        br2.close();
    }
}
