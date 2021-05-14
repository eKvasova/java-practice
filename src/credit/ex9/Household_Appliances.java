package credit.ex9;

public abstract class Household_Appliances{

    final private String name;
    final private String brand;
    private String locationRoom;
    final private int power;
    final private int weight;
    final private int height;
    final private int width;
    private boolean isOn;

    public Household_Appliances(String name, String brand, String locationRoom,int power, int weight,
                                int height, int width, boolean isOn) {
        this.name = name;
        this.brand = brand;
        this.locationRoom = locationRoom;
        this.power = power;
        this.weight = weight;
        this.height = height;
        this.width = width;
        this.isOn = isOn;
    }

    public int getPower() {
        if (isOn) {
            System.out.println("Ваш прибор " + name + " потребляет " + power + " Кв/час");
            return power;
        } else {
            System.out.println("Ваш прибор " + name + " выключен");
            return -1;
        }
    }

    public boolean getSwitchStatus() {
        return isOn;
    }

    public String getName() {
        System.out.println(name);
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public String getLocationRoom() {
        return locationRoom;
    }

    public int getWeight() {
        return weight;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public boolean turnOn() {
        if(!isOn) {
            System.out.println(name + " включен");
            return isOn = true;
        } else {
            System.out.println("Ваш прибор уже включен");
            return true;
        }
    }

    public void setLocationRoom(String locationRoom) {
         this.locationRoom = locationRoom;
    }

    @Override
    public String toString() {
        return  "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", locationRoom='" + locationRoom + '\'' +
                ", power=" + power +
                ", weight=" + weight +
                ", height=" + height +
                ", width=" + width +
                ", isOn=" + isOn;
    }
}
