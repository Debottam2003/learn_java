// Class name
public class Human {

    // Features of the class
    String name;
    int age;

    // Constructor: A constructor is a special method that is used to initialize
    // objects.
    // The constructor is called when an object of a class is created. It can be
    // used to set initial values for object attributes.

    // Methods of the class
    public Human(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Object Created.");
    }

    public void eat() {
        System.out.println(this.name + " is eating");
    }

    public void sleep() {
        System.out.println(this.name + " is sleeping");
    }

    public static void main(String[] args) {
        // Object creation
        Human human1 = new Human("Gagan", 24);
        Human human2 = new Human("Roni", 23);
        human1.eat();
        human2.sleep();
    }
}
