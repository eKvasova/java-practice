package credit.ex9;

public class TV extends Household_Appliances{

    final private double screenSize;
    final private String screenType;

    public TV(String name, String brand, String locationRoom, int power, int weight, int height, int width, boolean isOn, double screenSize, String screenType) {
        super(name, brand, locationRoom, power, weight, height, width, isOn);
        this.screenSize = screenSize;
        this.screenType = screenType;
    }
}
