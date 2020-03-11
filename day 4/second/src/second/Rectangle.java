package second;

public class Rectangle extends Shape {

    double length, width;
    double peremeter;
   

    void setLength(double length) {
        this.length = length;
    }

    void setWidth(double width) {
        this.width = width;
    }

    Rectangle() {

    }

    Rectangle(String name, double length, double width) {
        super.name = name;
        this.length = length;
        this.width = width;
    }

    @Override
    double getArea() {
        area = length * width;
//        System.out.println("area is : " +area);
        return area;
    }
    
    double getPerimeter(){
        peremeter=2*(length+width);
        return peremeter;
        
    }
}
