package day5_interfaces;

import java.util.Scanner;

public class Apple extends Fruit  implements Edible,Selleble {

    double weight;
    String color;
    double marketPrice;

    Apple() {

    }

    Apple(double weight, String color) {
        this.weight = weight;
        this.color = color;
    }

    void printDetails() {
        if ((color.contains("light green")) && (weight >= 100)) {
            System.out.println("this apple is edible");
            System.out.println("price is : "+marketPrice);
            print();
            
        } else {
            System.out.println("this apple is not edible");
            print();

        }
    }

    @Override
    public void setColor() {
        this.color = Edible.COLOR;
    }

    @Override
    public void setWeight() {
        this.weight = Edible.WEIGHT;
    }

    @Override
    public void setMarketPrice() {
        System.out.println("Enter a price ");
        this.marketPrice = new Scanner(System.in).nextDouble();
       
    }
}
