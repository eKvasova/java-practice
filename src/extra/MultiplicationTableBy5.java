package extra;

public class MultiplicationTableBy5 {
    public static void main(String[] args) {
        multiplicationTable(5);

    }
    public static void multiplicationTable(int multiplier) {
        for (int i = 1; i <= 10; i++) {
            int j = i * multiplier;
            System.out.println( i + "x" + multiplier + " = " + j);
        }

    }

}
