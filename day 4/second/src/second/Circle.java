package second;

public class Circle extends Shape {

    double radius;
    double paridiya;

    void setRadius(String name, double radius) {
        super.name = name;
        this.radius = radius;
    }

    Circle() {

    }

    Circle(String name,double radius) {
        this.radius = radius;
    }

    @Override
    double getArea() {
        area = 3.14 * radius * radius;
//        System.out.println("area is : " + getArea());
        return area;
    }
    
    double getParidiya(){
        paridiya=2*3.14*radius;
        return paridiya;
        
    }
}
