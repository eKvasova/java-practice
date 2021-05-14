package credit.ex9;

public class Microwave extends Household_Appliances {

    final private String microwaveType;
    final private boolean withGrill;

    public Microwave(String name, String brand, String locationRoom, int power,
                     int weight, int height, int width, boolean isOn, String microwaveType, boolean withGrill) {
        super(name, brand, locationRoom, power, weight, height, width, isOn);
        this.microwaveType = microwaveType;
        this.withGrill = withGrill;
    }
}
