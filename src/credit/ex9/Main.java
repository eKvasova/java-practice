package credit.ex9;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        TV tv = new TV("Телевизор","LG","комната",400,
                5,68,102,false,55.1,"");

        Fridge fridge = new Fridge("Холодильник","Bosch","кухня",200,
                15,200,70,false,200,"Frost Free");

        Microwave microwave = new Microwave("Микроволновая печь","LG","кухня",700,
                2,50,70,false,"",true);

        PC laptop = new PC("Ноутбук","Dell","комната",80,
                4,5,55,false,"Windows",23,6);

        Stove stove = new Stove("Плита","Gorenie","кухня",2000,
                10,85,55,false,"",4);

        VacuumCleaner vacuumCleaner = new VacuumCleaner("Пылесос","Xiaomi","комната",20,
                3,10,30,false,true);


        List<Household_Appliances> listHome = new ArrayList<>();
        listHome.add(tv);
        listHome.add(fridge);
        listHome.add(microwave);
        listHome.add(laptop);
        listHome.add(stove);
        listHome.add(vacuumCleaner);

        tv.turnOn();
        fridge.turnOn();
        stove.turnOn();
        System.out.println("-----------------------------");

        int sum  = listHome.stream()
                .filter(Household_Appliances::getSwitchStatus)
                .mapToInt(Household_Appliances::getPower)
                .sum();
        System.out.println("Потребляемая мощность включенных приборов: " + sum);
        System.out.println("-----------------------------");

        List<Household_Appliances> sortedList = listHome.stream()
                .sorted(Comparator.comparing(Household_Appliances::getLocationRoom))
                .collect(Collectors.toList());
        sortedList.forEach(System.out::println);
        System.out.println("-----------------------------");

        List<Household_Appliances> filteredListHome = listHome.stream()
                .filter(t -> t.getLocationRoom().equals("кухня"))
                .filter(t -> (t.getWidth() < 70))
                .collect(Collectors.toList());
        filteredListHome.forEach(System.out::println);










    }
}
