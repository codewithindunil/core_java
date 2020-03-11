package second;

public class testShape {

    Shape sh1;

    public testShape() {

    }

    public testShape(Shape sh1) {
        this.sh1 = sh1;
    }

    void setSh1(Shape sh1) {
        this.sh1 = sh1;
    }

    void printPerimeter() {
        if (sh1 instanceof Squre) {
            Squre s1 = (Squre) sh1;
            System.out.println("perimeter : " + s1.getPerimeter());

        } else if (sh1 instanceof Rectangle) {
            Rectangle r1 = (Rectangle) sh1;
            System.out.println("perimeter : " + r1.getPerimeter());
        } else if (sh1 instanceof Circle) {
            Circle c1 = (Circle) sh1;
            System.out.println("paridiya : " + c1.getParidiya());
        }
    }
}
