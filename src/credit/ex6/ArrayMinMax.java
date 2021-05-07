package credit.ex6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ArrayMinMax {

    final private List<Integer> array = new ArrayList<>();
    final private Random rd = new Random();

    public void addItems() {
        for (int i = 0; i <= 10; i++) {
            array.add(rd.nextInt(100));
        }
    }

    public void printArrayList() {
        for (Integer i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public void getMax() {
        System.out.println("Max value:" + Collections.max(array) +
                " Index:" + array.indexOf(Collections.max(array)));
    }

    public void getMin() {
        System.out.println("Min value:" + Collections.min(array) +
                " Index:" + array.indexOf(Collections.min(array)));
    }
}
