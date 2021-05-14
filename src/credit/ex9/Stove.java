package credit.ex9;

public class Stove extends Household_Appliances {

    final private String fuelType;
    final private int numberOfBurners;

    public Stove(String name, String brand, String locationRoom, int power,
                 int weight, int height, int width, boolean isOn, String fuelType, int numberOfBurners) {
        super(name, brand, locationRoom, power, weight, height, width, isOn);
        this.fuelType = fuelType;
        this.numberOfBurners = numberOfBurners;
    }
}
