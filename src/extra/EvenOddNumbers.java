package extra;

import java.util.Scanner;

public class EvenOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = scanner.nextInt();

        int countEven = 0;
        int countOdd = 0;

        while (number != 0) {
            int lastDigit = number % 10;
            if (lastDigit % 2 == 0) {
                countEven ++;
            } else {
                countOdd ++;
            }
            number /= 10;
        }
        System.out.println("Even count: " + countEven);
        System.out.println("Odd count: " + countOdd);
    }
}
