package exam.ex4;

public class TwoDimensionalArray {

    public static void main(String[] args) {

        int n = 7;
        int[][] array = new int[n][n];
        for (int i = 0; i < array.length;i++) {
            for (int j = 0; j < array[i].length; j++) {
                if ( i == j) {
                    array[i][j] = 0;
                } else if ((i + j) == (array.length - 1)) {
                    array[i][j] = 0;
                } else if (((i + j) <= (array.length - 2) && (i > j))
                        || ((i + j) >= array.length) && (j > i)) {
                    array[i][j] = (int)(Math.random() * 8) - 9;
                } else {
                    array[i][j] = (int)(Math.random() * 9) + 1;
                }
            }
        }

        for (int[] k : array) {
            for (int l : k) {
                System.out.print(String.format("%2d",l) + " ");
            }
            System.out.println();
        }

        int sum = 0;
        for (int[] k : array) {
            for (int l : k) {
                sum += l;
            }
        }
        System.out.println("\n" + "Суммa всех элементов: " + sum);

        double sum2 = 0;
        int count = 0;
        for (int[] k : array) {
            for (int l : k) {
                if (l > sum) {
                    sum2 += l;
                    count ++;
                }
            }
        }
        double average = sum2 / count;
        System.out.println("Cреднее арифметическое всех элементов больше "
                + sum + " : " + String.format("%.4f",average));
    }
}
