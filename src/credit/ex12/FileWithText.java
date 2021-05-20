package credit.ex12;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Paths;

import static java.nio.file.Files.newBufferedReader;

public class FileWithText {

    public static void main(String[] args) throws IOException {

        String line;
        int wordCount = 0;
        int punctuationMarksCount = 0;


        try (BufferedReader br =
                     newBufferedReader(Paths.get(".\\src\\credit\\ex12\\file.txt"))) {

            while ((line = br.readLine()) != null) {
                line = line.trim().replaceAll("\\s+", " ");
                String[] words = line.split("[\\s\\W]+");
                wordCount = wordCount + words.length;
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Количество слов в тексте: " + wordCount);


        try (BufferedReader br2 =
                     newBufferedReader(Paths.get(".\\src\\credit\\ex12\\file.txt"))) {

            while ((line = br2.readLine()) != null) {
                line = line.replaceAll("\\s+", "").trim();
                String[] array = line.split("");

                for (String i : array) {
                    if (i.matches("\\W")) {
                        punctuationMarksCount++;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Количество знаков пунктуации: " + punctuationMarksCount);

    }
}
