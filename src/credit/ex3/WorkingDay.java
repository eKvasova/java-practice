package credit.ex3;

public class WorkingDay {

    public static void main(String[] args) {

        int n = (int)(Math.random() * 28801);
        System.out.println(n);

        int hours = n / 3600;

        if (hours < 1) {
            System.out.println("Осталось менее часа");
        } else if (hours == 1) {
            System.out.println("Остался один час");
        } else if ((hours == 2) || (hours == 3) || (hours == 4)) {
            System.out.println("Осталось " + hours + " часа");
        } else if (n < 3600) {
            System.out.println("Рабочий день закончился");
        } else {
            System.out.println("Осталось " + hours + " часов");
        }
    }
}
