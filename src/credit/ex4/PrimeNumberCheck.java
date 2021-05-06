package credit.ex4;

import java.util.Scanner;

public class PrimeNumberCheck {

    private static void primeNumberChecker() {
        Scanner scanner = new Scanner(System.in);
        String message = "Введите число от 2 до 100";
        System.out.println(message);
        int number = scanner.nextInt();
        isPrimeNumber(number);
    }

    private static void isPrimeNumber(int number) {

        if ((number < 2) || (number > 100)){
           primeNumberChecker();
        } else if (number == 2) {
            System.out.println("Ваше число " + number + " является простым");
        } else if (number % 2 == 0) {
            System.out.println("Ваше число " + number + " является составным");
        } else {
            for (int i = 3; i <= (int) Math.sqrt(number); i += 2) {
                if (number % i == 0) {
                    System.out.println("Ваше число " + number + " является составным");
                }
            }
            System.out.println("Ваше число " + number + " является простым");
        }
    }

    public static void main(String[] args) {

        primeNumberChecker();
    }
}
