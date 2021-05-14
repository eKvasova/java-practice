package credit.ex9;

public class PC extends Household_Appliances {

    private String operatingSystem;
    private int displaySize;
    private int ram;

    public PC(String name, String brand, String locationRoom, int power,
              int weight, int height, int width, boolean isOn, String operatingSystem, int displaySize, int ram) {
        super(name, brand, locationRoom, power, weight, height, width, isOn);
        this.operatingSystem = operatingSystem;
        this.displaySize = displaySize;
        this.ram = ram;
    }
}
