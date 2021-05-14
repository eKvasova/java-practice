package credit.ex9;

public class Fridge extends Household_Appliances {

    final private int capacity;
    final private String defrostingType;

    public Fridge(String name, String brand, String locationRoom, int power,
                  int weight, int height, int width, boolean isOn, int capacity, String defrostingType) {
        super(name, brand, locationRoom, power, weight, height, width, isOn);
        this.capacity = capacity;
        this.defrostingType = defrostingType;
    }
}
