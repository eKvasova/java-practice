package extra;

public class First15Exponent {

    public static void main(String[] args) {
        getExponentiation(3);
    }

    public static void getExponentiation(int number) {
        for (int i = 1; i <= 15; i++) {
            int pow = (int)Math.pow(number,i);
            System.out.print(pow + " ");
        }
    }
}
