package exam.ex6;

import java.util.*;

public class Bouquet {

    public static void main(String[] args) {

        Flower roseRed = Flower.ROSE1;
        Flower roseYellow = Flower.ROSE2;
        Flower carnation  = Flower.CARNATION;
        Flower tulip = Flower.TULIP;
        Flower lily = Flower.LILY;
        Flower chamomile = Flower.CHAMOMILE;

        List<Flower> bouquet = new ArrayList<>();
        bouquet.add(roseRed);
        bouquet.add(roseRed);
        bouquet.add(roseRed);
        bouquet.add(roseYellow);
        bouquet.add(lily);
        bouquet.add(carnation);
        bouquet.add(tulip);
        bouquet.add(tulip);
        bouquet.add(tulip);
        bouquet.add(chamomile);


        double sum = 0;
        for (Flower flower : bouquet) {
            sum += flower.getPrice();
        }
        System.out.println("The bouquet costs " + sum);

        Set<String> colorsSet = new HashSet<>();
        for (Flower flower : bouquet) {
            colorsSet.add(flower.getColor());
        }

        System.out.println("The bouquet contains the following colors:");
        for (String s : colorsSet) {
            System.out.println(s);
        }

        Set<Integer> lifeDaysSet = new HashSet<>();
        for (Flower flower : bouquet) {
            lifeDaysSet.add(flower.getLifeDays());
        }

        Integer maxDays = lifeDaysSet
                .stream()
                .max(Comparator.naturalOrder())
                .orElse(null);

        System.out.println("All flowers will be died in " + maxDays + " days");
    }
}
