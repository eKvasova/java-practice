package credit.ex5;

public class ElectronicClock {

    public static void main(String[] args) {

        int count = 0;

        for (int i = 0; i < 24; i++) {
            int h1 = i / 10;
            int h2 = i % 10;

            for (int k = 0; k < 60; k++) {
                int m1 = k / 10;
                int m2 = k % 10;

                if ((h1 == m2) && (h2 == m1)) {
                    count++;
                }
            }
        }
        System.out.println("Количество симметричных операций : " + count);
    }
}
