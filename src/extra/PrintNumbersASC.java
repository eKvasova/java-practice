package extra;

public class PrintNumbersASC {
    public static void main(String[] args) {
        getNumbersAsc(12);
    }

    public static void getNumbersAsc(int number) {
        for (int i = 1; i <= number; i++) {
            System.out.print(i + " ");
        }
    }
}
