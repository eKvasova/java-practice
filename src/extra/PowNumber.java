package extra;

public class PowNumber {
    public static void main(String[] args) {
        getExponentiation(2);
    }

    public static void getExponentiation(int number) {
        for (int i = 0; i < 10; i++) {
            int pow = (int)Math.pow(number,i);
            System.out.print(pow + " ");
        }
    }
}
