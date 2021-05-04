package exam.ex2;

public class ArmyUnluckyNumbers {

    public static void main(String[] args) {

        getUnluckyNumbersCount(100000);
    }

    public static void getUnluckyNumbersCount (int range) {

        int count = 0;

        for (int i = 1; i < range; i++) {

            int d = i;
            while (d > 0) {
                if ((d % 10 == 4) || (d % 100 == 13)) {
                    count++;
                    break;
                }
                d /= 10;
            }
        }
        System.out.println(count + " numbers should be removed.");
    }
}

