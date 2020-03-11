package second;

public class Shape {

    String name;
    double area;

    void setName(String name) {
        this.name = name;
    }

    void setArea(double area) {
        this.area = area;
    }

    String getName() {
        return name;
    }

    double getArea() {
        return area;
    }

    Shape() {

    }

    Shape(String name) {
        this.name = name;
    }

}
