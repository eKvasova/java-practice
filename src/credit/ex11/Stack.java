package credit.ex11;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.NoSuchElementException;

public class Stack {

    private static Deque<Integer> mainStack = new ArrayDeque<>();
    private static Deque<Integer> maxStack = new ArrayDeque<>();


    public static void push(int x) {

        int max = x;
        if (!maxStack.isEmpty() && max < maxStack.peekFirst()) {
            max = maxStack.peekFirst();
        }

        mainStack.push(x);
        maxStack.push(max);
    }

    public static void pop() {

        if (mainStack.isEmpty() || maxStack.isEmpty()) {
            throw new NoSuchElementException();
        }
        mainStack.pop();
        maxStack.pop();
    }

    public static void getMax() {
        System.out.println("Maximum element  - > " + maxStack.peekFirst());
        //return maxStack.peek();
    }


    public static void main(String[] args) {

        Deque<Integer> testStack = new ArrayDeque<>();
        testStack.push(15);
        testStack.push(5);
        testStack.push(88);
        //testStack.getMax();




    }

}
