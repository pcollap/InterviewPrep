package ObjectOrientedDesign.Abstraction.Shape;

public class Circle extends Shape {

    double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public String draw() {
        return "This is a circle";
    }
}
