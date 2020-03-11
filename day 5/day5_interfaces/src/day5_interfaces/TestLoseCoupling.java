package day5_interfaces;

public class TestLoseCoupling {

    Object o;

    public TestLoseCoupling(Object o) {
        this.o = o;
    }

    void filterDecayNonDecay() {
        if (o instanceof Decayble) {
            System.out.println("This will decay.A Nature Friend");
        } else if (o instanceof NotDecayble) {
            System.out.println("This will Not decay. Not a Nature Friend");

        }
    }

    void filterAplleOrange() {
        if (o instanceof Apple) {
            System.out.println("This Is Apple");
        } else if (o instanceof Orange) {
            System.out.println("This Is Prange");
        }
    }

}
