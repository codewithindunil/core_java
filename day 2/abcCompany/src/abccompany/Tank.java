package abccompany;

public class Tank {

    double height;
    double width;
    double length;
    static double labourCost = 500.0;
    static double unitPrice = 20.0;

    void setHeight(double height) {
        this.height = height;
    }

    void setWidth(double width) {
        this.width = width;
    }

    void setLength(double length) {
        this.length = length;
    }

    Tank() {
    }

    Tank(double width, double length) {
        this.width = width;
        this.length = length;

    }

    Tank(double height, double width, double length) {
        this.height = height;
        this.width = width;
        this.length = length;

    }

    double volume() {
        double vol = (height * width * length);
        return vol;
    }

    double surfaceArea() {
        double area = 2 * ((height * length) + (height * width)) + (length * width);
        return area;
    }

    double totalCost() {
        double tCost = (Tank.unitPrice + surfaceArea()) + Tank.labourCost;
//        System.out.println(tCost);
        return tCost;
    }

    void quotation() {
        System.out.println("QUOTATION");
        System.out.println("height       :" + height);
        System.out.println("width        :" + width);
        System.out.println("length       :" + length);
        System.out.println("labourCost   :" + labourCost);
        System.out.println("materialCost :" + (Tank.unitPrice + surfaceArea()));
        System.out.println("Total : " + totalCost());

    }

}
