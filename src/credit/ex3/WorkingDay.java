package credit.ex3;

public class WorkingDay {

    public static void main(String[] args) {

        int n = (int)(Math.random() * 28801);
        System.out.println(n);

        int hours = n / 3600;

        switch (hours) {
            case 0:
                if (n == 0) {
                    System.out.println("Рабочий день закончился");
                } else {
                    System.out.println("Осталось менее часа");
                }
                break;
            case 1:
                System.out.println("Остался один час");
                break;
            case 2:
            case 3:
            case 4:
                System.out.println("Осталось " + hours + " часа");
                break;
            default:
                System.out.println("Осталось " + hours + " часов");
        }
    }
}
