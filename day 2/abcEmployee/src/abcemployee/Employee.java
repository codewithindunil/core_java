package abcemployee;

public class Employee {

    private String name;
    private int age;
    private String gender;
    private int mobile;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setMobile(int mobile) {
        this.mobile = mobile;
    }

    Employee() {

    }

    Employee(String name, int age, String gender, int mobile) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.mobile = mobile;

    }

    Employee(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;

    }

    Employee(String name, int age) {
        this.name = name;
        this.age = age;

    }

    Employee(String name) {
        this.name = name;

    }

    void print() {
        System.out.println("******************************************");
        System.out.println("           EMPLOYEE DETAILS");
        System.out.println("******************************************");
        System.out.println("Employee name   : " + name);
        System.out.println("Employee age    : " + age);
        System.out.println("Employee gende  : " + gender);
        System.out.println("Employee mobile : " + mobile);
        System.out.println("******************************************");

    }

}
