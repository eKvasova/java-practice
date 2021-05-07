package credit.ex8;

public class PunctuationMarks {

    public static void main(String[] args) {


        String text = "RegExr,,,... was!!! %$#%/ created by.com, and is proudly hosted by Media Temple.\n" +
                "\n" +
                "Edit the,:';] Expression & Text to see matches.";

        text = text.replaceAll("\\s+","").trim();

        String[] array = text.split("");

        int count = 0;
        for (String i : array) {
            if (i.matches("\\W")) {
                count++;
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println("Количество знаков пунктуации: " + count);
    }
}
