package exam.ex2;

public class ArmyUnluckyNumbers {

    public static void main(String[] args) {

        getUnluckyNumbersCount(100000);
    }

    public static void getUnluckyNumbersCount (int range) {

        String[] numberArray = new String[range];

        for (int i = 0; i < numberArray.length; i++) {
            numberArray[i] = String.valueOf(i);
        }

        int count = 0;
        for (int i = 1; i <numberArray.length; i++) {
            boolean four = numberArray[i].contains("4");
            boolean thirteen = numberArray[i].contains("13");

            if (four || thirteen) {
                count ++;
            }
        }
        System.out.println(count + " car numbers should be removed.");
    }
}

