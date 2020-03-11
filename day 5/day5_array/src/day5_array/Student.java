package day5_array;

public class Student {

    String name;
    String gender;

    public Student() {
    }

    public Student(String name, String gender) {

        this.name = name;
        this.gender = gender;
    }

    void print() {
        System.out.println("Name : " + name);
        System.out.println("gender : " + gender);

    }
}
