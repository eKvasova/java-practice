package extra;

public class DistanceBetweenAandB {

    public static void main(String[] args) {
        System.out.println("Distance = " + Distance(-7,6,-9,2));
    }
    public static int Distance(int x1, int x2, int y1, int y2) {
        System.out.println("Formula: \u221A(" + x2 + " - " + "(" + x1 + "))\u00B2" +
                " + (" + y2 + " - (" + y1 + "))\u00B2");
        return (int)Math.sqrt((int)Math.pow((x2-x1),2) + (int)Math.pow((y2-y1),2));
    }
}
