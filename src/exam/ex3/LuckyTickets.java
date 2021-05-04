package exam.ex3;

public class LuckyTickets {

    public static void main(String[] args) {

        int maxRange = 999999;
        int count = 0;

        for (int i = 1; i <= maxRange; i++) {

            int number1 = i / 100000;
            int number2 = (i / 10000) % 10;
            int number3 = (i / 1000) % 10;
            int number4 = (i / 100) % 10;
            int number5 = (i / 10) % 10;
            int number6 = i % 10 ;

            if ((number1 + number2 + number3) == (number4 + number5 + number6)) {
                count ++;
            }
        }
        System.out.println("This roll contains " + count + " lucky numbers." +
                    " Please get ready to present souvenirs ;)");
    }
}
