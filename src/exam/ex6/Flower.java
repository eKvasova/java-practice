package exam.ex6;


public enum Flower {

    ROSE1 ("red",5.50, 7),
    ROSE2 ("yellow",5.50,7),
    CARNATION ("red",3.00,14),
    TULIP ("orange", 2.00,7),
    LILY ("white", 7.00,20),
    CHAMOMILE ("white", 2.00,25);

    private String color;
    private double price;
    private int lifeDays;

    Flower (String color, double price, int lifeDays) {
        this.color = color;
        this.price = price;
        this.lifeDays = lifeDays;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

    public int getLifeDays() {
        return lifeDays;
    }
}
