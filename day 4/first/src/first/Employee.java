package first;

public class Employee extends Person {

    double salary;
    String post;

    Employee() {

    }

    Employee(String name, String gender, double salary, String post) {
        super(name, gender);
        this.salary = salary;
        this.post = post;
    }

    void print() {
        super.print();
        System.out.println("salary   : " + salary);
        System.out.println("post : " + post);
    }
}
