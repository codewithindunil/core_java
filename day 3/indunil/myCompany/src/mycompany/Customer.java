package mycompany;

public class Customer {

    String name;
    int nic;
    int mobile;
    String address;
    String rentedCar;
    Address ad;
    Car car;

    void setName(String name) {
        this.name = name;
    }

    void setNic(int nic) {
        this.nic = nic;
    }

    void setMobile(int mobile) {
        this.mobile = mobile;
    }

    void setAddress(String address) {
        this.address = address;
    }

    void setRentedCar(String rentedCar) {
        this.rentedCar = rentedCar;
    }

    void setAd(Address ad) {
        this.ad = ad;
    }

    void setCar(Car car) {
        this.car = car;
    }

    Customer() {
        ad = new Address();
        car = new Car();
    }

    Customer(String name, int nic, int mobile, String address, String rentedCar,Address ad,Car car) {
        this.name = name;
        this.nic = nic;
        this.mobile = mobile;
        this.address = address;
        this.rentedCar = rentedCar;
        this.ad = ad;
        this.car = car;

    }

    void printCustomer() {
        System.out.println("===================+===========");
        System.out.println("name         : " + name);
        System.out.println("nic          : " + nic);
        System.out.println("mobile       : " + mobile);
        System.out.println("address      : " + address);
        System.out.println("rentedCar    : " + rentedCar);
        System.out.println("===============================");

    }

}
