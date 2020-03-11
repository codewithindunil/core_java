package mycompany;

import java.util.Scanner;

public class VehicleManagement {

    public static void main(String[] args) {
        String name;
        int nic;
        int mobile;
        String address;
        String rentedCar;

        int homeNo;
        String road;
        String town;
        String province;

        String carMake;
        String model;
        int manYear;
        int engCap;
        int noOfP;

        System.out.println("Please enter customer details");

        System.out.println("Enter your name : ");
        name = new Scanner(System.in).nextLine();
        System.out.println("Enter your nic : ");
        nic = new Scanner(System.in).nextInt();
        System.out.println("Enter your mobile : ");
        mobile = new Scanner(System.in).nextInt();
        System.out.println("Enter your address : ");
        address = new Scanner(System.in).nextLine();
        System.out.println("Enter your rentedCar : ");
        rentedCar = new Scanner(System.in).nextLine();

        System.out.println("Please enter Adress details");

        System.out.println("Enter your homeNo : ");
        homeNo = new Scanner(System.in).nextInt();
        System.out.println("Enter your road : ");
        road = new Scanner(System.in).nextLine();
        System.out.println("Enter your town : ");
        town = new Scanner(System.in).nextLine();
        System.out.println("Enter your province : ");
        province = new Scanner(System.in).nextLine();

        System.out.println("Please enter Vehicle details");

        System.out.println("Enter your carMake : ");
        carMake = new Scanner(System.in).nextLine();
        System.out.println("Enter your model : ");
        model = new Scanner(System.in).nextLine();
        System.out.println("Enter your manYear : ");
        manYear = new Scanner(System.in).nextInt();
        System.out.println("Enter your engCap : ");
        engCap = new Scanner(System.in).nextInt();
        System.out.println("Enter your noOfP : ");
        noOfP = new Scanner(System.in).nextInt();

        Customer c1 = new Customer(name, nic, mobile, address, rentedCar, new Address(homeNo, road, town, province), new Car(carMake, model, manYear, engCap, noOfP));
        c1.printCustomer();
        c1.ad.printAddress();
    }

}
