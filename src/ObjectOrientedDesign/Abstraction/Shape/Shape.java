package ObjectOrientedDesign.Abstraction.Shape;

public abstract class Shape {
    String color;

    public Shape(String c) {
        this.color = c;
    }

    abstract double getArea();
    abstract String draw();
}
