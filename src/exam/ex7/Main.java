package exam.ex7;

public class Main {
    public static void main(String[] args) {

        Pair<Integer,String> p1 = new Pair<>(1,"hello");
        Pair<String,String> p2 = new Pair<>("hello1", "hello2");
        System.out.println(p1.getFirst());
        System.out.println(p2.getLast());
        p1 = p1.swap();
        System.out.println(p1.getFirst());
       // p2.replaceFirst();
        p2.getFirst();



    }
}
