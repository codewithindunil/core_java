package first;

public class First {

    public static void main(String[] args) {
        Dog d1 = new Dog("tommy", 12, 22.3);
        Dog d2 = new Dog();
//        d1.fill("ruwan", 12, 32.2);
//        d2.fill("tommy", 15, 12.2);

//        d1.name = "tommy";
//        d1.age = 12;
//        d1.weight = 30.3;
//        String a = d1.eat("cake");
//        System.out.println(a);
//
//        d1.name = "boola";
//        d1.setName("ruwan");
//        System.out.println(d1.eat("rice"));
//        System.out.println(d1.getName());
//        System.out.println(d2.eat("rice"));
        d1.bark();
        System.out.println(d1.eat("rice"));

    }

}
