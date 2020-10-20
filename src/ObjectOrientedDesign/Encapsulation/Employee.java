package ObjectOrientedDesign.Encapsulation;

public class Employee {
    //Encapsulation hides unwanted implementation details from the users of an object.
    //Its a way of wrapping data and code acting on the data into a single unit.
    //Do this because we want to keep classes separated and prevent them from being tightly coupled
    //with each other. Only accessed through specific methods of its own class
    private String name;
    private int age;
    private int id;

    public Employee(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }
}
