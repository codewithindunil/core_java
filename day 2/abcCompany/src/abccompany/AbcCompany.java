package abccompany;

import java.util.Scanner;

public class AbcCompany {

    public static void main(String[] args) {
        double height = 10;
        double width = 10;
        double length = 10;
        Tank tFull = new Tank(height, width, length);
        Tank tBottom = new Tank(height, length);
        Scanner s1 = new Scanner(System.in);
        double y=s1.nextDouble();
        String d=s1.next();
        Cashier c = new Cashier(12, 123);
        tFull.quotation();
        tBottom.quotation();

    }

}
