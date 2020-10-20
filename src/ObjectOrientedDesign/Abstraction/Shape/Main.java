package ObjectOrientedDesign.Abstraction.Shape;

public class Main {
    public static void main (String[] args) {
        //Abstraction hides implementation complexity offered by an API, design, or system
        //Allows essential details to be displayed to the user so that the feature can be used in many ways
        //rather than in one super specific way

        Rectangle rectangle = new Rectangle("purple", 5, 2);
        Circle circle = new Circle("yellow", 6);

        System.out.println("Rectangle area: " + rectangle.getArea());
        System.out.println("Rectangle draw: " + rectangle.draw());

        System.out.println("Circle area: " + circle.getArea());
        System.out.println("Circle draw: " + circle.draw());
    }
}
