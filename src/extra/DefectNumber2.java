package extra;

public class DefectNumber2 {
    public static void main(String[] args) {
        System.out.println(getDefectsSum(50000));
    }

    public static int getDefectsSum(int rack) {
        int sum = 0;
        int temp1 = 0;
        for (int i = 1; i <= rack; i++) {
            int j = i;
            while (j > 0) {
                if (j % 10 == 2) {
                    sum++;
                    j = 0;
                }
                j /= 10;
            }
        }
        return sum;
    }
}



