package extra;

public class PrintNumbersDESC {
    public static void main(String[] args) {
        getNumbersDesc(21);
    }

    public static void getNumbersDesc (int number) {
        for (int i = number; i > 0; i--) {
            System.out.print(number + " ");
            number --;
        }
    }

}
