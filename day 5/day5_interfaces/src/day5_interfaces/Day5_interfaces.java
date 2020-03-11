package day5_interfaces;

import java.util.Scanner;

public class Day5_interfaces {

    public static void main(String[] args) {

        /*    Scanner scan = new Scanner(System.in);
        Apple a2 = new Apple(130, "light green");
        Apple a1 = new Apple();
        a1.printDetails();
        a2.setColor();
        a2.setWeight();
        a2.setMarketPrice();
        a2.printDetails();
        Orange o1=new Orange();
        o1.setColor();
        o1.setWeight();
         */
        
//        TestLoseCoupling t1=new TestLoseCoupling(new Apple());
//        TestLoseCoupling t2=new TestLoseCoupling(new ToyApple());
//        t1.filterDecayNonDecay();
//        t2.filterDecayNonDecay();

        Edible e1=new Apple();
        Edible e2=new Orange();
        TestLoseCoupling t3= new TestLoseCoupling(e1);
        TestLoseCoupling t4= new TestLoseCoupling(e2);
        t3.filterAplleOrange();
        t4.filterAplleOrange();
    }

}
