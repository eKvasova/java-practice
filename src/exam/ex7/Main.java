package exam.ex7;

@SuppressWarnings("rawtypes")
public class Main {

    public static void main(String[] args) {

        Pair<Integer,String> p1 = new Pair<>(1,"hello");
        Pair<String,String> p2 = new Pair<>("633", "hello2");
        System.out.println(p1.getFirst());
        System.out.println(p2.getLast());
        p1 = p1.swap();
        System.out.println(p1.getFirst());
        Pair replacedFirst = p2.replaceFirst(2.12);
        System.out.println(replacedFirst.getFirst());
        Pair replacedLast = p2.replaceLast(5122L);
        System.out.println(replacedLast.getLast());
    }
}
