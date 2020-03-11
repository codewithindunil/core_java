package first;

public class Dog {

    String name;
    int age;
    double weight;

    void fill(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    //default constructr
    Dog() {

    }

    //parameterized constructr
    Dog(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    //has parameter has return
    String eat(String food) {
        return "i am " + name + " i am eating " + food;
    }

    //no parameter has return
    String getName() {
        return name;
    }

    //has parameter no return 
    void setName(String newName) {
        name = newName;
        System.out.println(" i am " + name);
    }

    //no parameter no return
    void bark() {
        System.out.println(name+" baw baw baw");
    }

}
