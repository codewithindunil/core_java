package mycompany;

public class Car {

    String carMake;
    String model;
    int manYear;
    int engCap;
    int noOfP;

    void setCarMake(String carMake) {
        this.carMake = carMake;
    }

    void setModel(String model) {
        this.model = model;
    }

    void setManYear(int manYear) {
        this.manYear = manYear;
    }

    void setEngCap(int engCap) {
        this.engCap = engCap;
    }

    void setNoOfP(int noOfP) {
        this.noOfP = noOfP;
    }

    Car() {

    }

    Car(String carMake, String model, int manYear, int engCap, int noOfP) {
        this.carMake = carMake;
        this.model = model;
        this.engCap = engCap;
        this.manYear = manYear;
        this.noOfP = noOfP;
    }

    void printCar() {
        System.out.println("=====================");
        System.out.println("carMake : " + carMake);
        System.out.println("model   : " + model);
        System.out.println("engCap  : " + engCap);
        System.out.println("manYear : " + manYear);
        System.out.println("noOfP   : " + noOfP);
        System.out.println("=====================");

    }
}
