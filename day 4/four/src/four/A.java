package four;

/**
 *
 * @author IcCoBoDeCrAnE
 */
public abstract class A {

    int x;

    A() {

    }

    A(int x) {
        this.x = x;
    }

    void print() {
        System.out.println("x " + x);

    }

    abstract void doubleX();

    abstract void tripleX();
}
