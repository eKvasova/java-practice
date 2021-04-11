package exam.ex5;

import java.util.*;

public class UniqueWords {

    public static void main(String[] args) {

        String text = "Listen to the News from! today,,, and read: the text at the same time.; " +
                " Listen to the news from today without reading the text.";
        System.out.println(text);

        text = text.trim().replaceAll("\\s+", " ");

        String[] words = text.split("[\\s\\W]+");

        Set<String> uniqueWords = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
        uniqueWords.addAll(Arrays.asList(words));

        System.out.println("\n" + uniqueWords.size());
    }
}
