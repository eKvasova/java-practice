package credit.ex9;

public class VacuumCleaner extends Household_Appliances{

    final private boolean isRobotVacuum;

    public VacuumCleaner(String name, String brand, String locationRoom, int power,
                         int weight, int height, int width, boolean isOn, boolean isRobotVacuum) {
        super(name, brand, locationRoom, power, weight, height, width, isOn);
        this.isRobotVacuum = isRobotVacuum;
    }
}
