package extra;

public class TestRunner {
    public static void main(String[] args) {
        System.out.println("Start of main() method");
        new ChildClass();
        System.out.println("-----------------------");
        new ChildClass();
        System.out.println("End of main() method");
    }

}
