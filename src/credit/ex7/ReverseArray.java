package credit.ex7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ReverseArray {

    final private List<Integer> reverseArray = new ArrayList<>();
    final private Random rd = new Random();

    public void addItems() {
        for (int i = 0; i <= 10; i++) {
            reverseArray.add(rd.nextInt(100));
        }
    }

    public void printArrayList() {
        for (Integer i : reverseArray) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public void getReverseArray() {
        Collections.reverse(reverseArray);
        printArrayList();
    }
}
