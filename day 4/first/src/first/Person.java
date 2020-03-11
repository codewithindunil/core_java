package first;

public class Person {

    String name, gender;

    void setName(String name) {
        this.name = name;
    }

    void setGeder(String geder) {
        this.gender = gender;
    }

    Person() {

    }

    Person(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    void print() {
        System.out.println("name   : " + name);
        System.out.println("gender : " + gender);

    }
}
