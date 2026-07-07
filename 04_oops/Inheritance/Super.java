public class Super {

    String name;
    int age;
    String gender;
    String country;

    public Super(String name, int age, String gender, String country) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.country = country;
        System.out.println("Object Created.");
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
}