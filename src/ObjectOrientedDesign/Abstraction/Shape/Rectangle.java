package ObjectOrientedDesign.Abstraction.Shape;

public class Rectangle extends Shape {

    double length;
    double width;

    public Rectangle(String color, double length, double width) {
        super(color); //calling the shape constructor
        this.length = length;
        this.width = width;
    }

    double getArea() {
        return length * width;
    }

    String draw() {
        return "This is rectangle with a length and width";
    }
}
