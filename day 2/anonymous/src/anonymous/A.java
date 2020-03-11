package anonymous;

public class A {

    int x;

    A() {

    }

    A(int x) {
        this.x = x;
    }

    void doubleX() {
        x = 2 * x;
    }

    void print() {
        System.out.println("x = " + x);
    }

}
