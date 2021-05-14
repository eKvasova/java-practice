package credit.ex4;

import java.util.Scanner;

public class PrimeNumberCheck {

    private static void primeNumberChecker() {
        Scanner scanner = new Scanner(System.in);
        String message = "Введите число больше 2";
        System.out.println(message);
        int number = scanner.nextInt();
        isPrimeNumber(number);
    }

    private static void isPrimeNumber(int number) {

        boolean isPrime = true;

        if (number < 2){
           primeNumberChecker();
        } else if (number == 2) {
            System.out.println("Ваше число " + number + " является простым");
        } else {
            for (int i = 2; i <= (int) Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    System.out.println("Ваше число " + number + " является составным");
                    break;
                }
            }
        }
        if (isPrime) {
            System.out.println("Ваше число " + number + " является простым");
        }
    }

    public static void main(String[] args) {
        primeNumberChecker();
    }
}
