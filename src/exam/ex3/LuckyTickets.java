package exam.ex3;

public class LuckyTickets {

    public static void main(String[] args) {

        int maxRange = 999999;
        int count = 0;
        for (int i = 1001; i <= maxRange; i++) {
            String numberFormatted = String.format("%06d",i);
            int number1 = Integer.parseInt(String.valueOf(numberFormatted.charAt(0)));
            int number2 = Integer.parseInt(String.valueOf(numberFormatted.charAt(1)));
            int number3 = Integer.parseInt(String.valueOf(numberFormatted.charAt(2)));
            int number4 = Integer.parseInt(String.valueOf(numberFormatted.charAt(3)));
            int number5 = Integer.parseInt(String.valueOf(numberFormatted.charAt(4)));
            int number6 = Integer.parseInt(String.valueOf(numberFormatted.charAt(5)));

            if ((number1 + number2 + number3) == (number4 + number5 + number6)) {
                count ++;
            }
        }
        System.out.println("This roll contains " + count + " lucky numbers." +
                    " Please get ready to present souvenirs ;)");
    }
}
