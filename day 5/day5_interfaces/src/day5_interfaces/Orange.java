package day5_interfaces;

import java.util.Scanner;

public class Orange implements Edible, Selleble {

    double weight;
    String color;
    double marketPrice;

    public Orange() {
    }

    void printDetails() {
        if ((color.contains("orange")) && (weight >= 150)) {
            System.out.println("this orange is edible");
        } else {
            System.out.println("this orange is not edible");

        }
    }

    @Override
    public void setColor() {
        System.out.println("Enter a color ");
        String c = new Scanner(System.in).nextLine();
        this.color = c;
    }

    @Override
    public void setWeight() {
        System.out.println("Enter a weight ");
        double w = new Scanner(System.in).nextDouble();
        this.weight = w;
    }

    @Override
    public void setMarketPrice() {
        System.out.println("Enter a price ");
        double p = new Scanner(System.in).nextDouble();
        this.weight = p;
    }

}
