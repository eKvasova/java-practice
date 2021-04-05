package credit.ex1;

public class Rectangle_Circle {

    public static void main(String[] args) {

        RectangleCoveringByCircle(6,8,5);
    }

    private static void RectangleCoveringByCircle(int a, int b, int r) {

        if (a <= 0 || b <= 0 || r <= 0) {
            System.out.println("Невалидные вводные данные");
        } else if (r * r >= (a * a + b * b) / 4) {
            System.out.println(a + "\n" + b + "\n" + r + "\n" +
                    "Картонка с радиусом " + r + " закрывает полностью отверстие размера "
                    + a + " * " + b);
        } else {
            System.out.println(a + "\n" + b + "\n" + r + "\n" +
                    "Картонка с радиусом " + r + " не закрывает полностью отверстие размера "
                    + a + " * " + b);
        }
    }
}
