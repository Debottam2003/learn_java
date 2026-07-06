// Class name
public class Human {

    // Features of the class
    String name;
    int age;
    String gender;
    String country;

    // Constructor: A constructor is a special method that is used to initialize
    // objects.
    // The constructor is called when an object of a class is created. It can be
    // used to set initial values for object attributes.

    // Methods of the class
    // Parameterized constructor
    public Human(String name, int age, String gender, String country) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.country = country;
        System.out.println("Object Created.");
    }

    // No parameterized constructor
    public Human() {
        this.name = "Unknown";
        this.age = 0;
        this.gender = "Unknown";
        this.country = "India";
    }

    // Default Constructor
    // Called automatically and features are initialized with default values of the data types

    // Copy Constructor
    public Human(Human h) {
        this.name = h.name;
        this.age = h.age;
        this.gender = h.gender;
        this.country = h.country;
    }

    public void eat() {
        System.out.println(this.name + " is eating");
    }

    public void sleep() {
        System.out.println(this.name + " is sleeping");
    }

    public void introduce() {
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.gender);
        System.out.println(this.country);
    }

    public static void main(String[] args) {
        // Object creation
        Human human1 = new Human("Gagan", 24, "male", "India");
        Human human2 = new Human("Debottam", 23, "male", "India");
        Human human3 = new Human("Shubh", 23, "male", "India");
        human1.eat();
        human1.sleep();
        human2.eat();
        human2.sleep();
        human3.eat();
        human3.sleep();
        Human human4 = new Human();
        human4.introduce();
        Human human5 = new Human(human2);
        human5.introduce();
    }
}