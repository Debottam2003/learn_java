public class Sub extends Super {
    String hobby;
    String fav_dish;

    public Sub(String name, int age, String gender, String country, String hobby) {
        super(name, age, gender, country);
        this.hobby = hobby;
    }

    // Method Overriding
    public void introduce() {
        super.introduce();
        System.out.println(this.hobby);
    }

    public void eat(String dish) {
        this.fav_dish = dish;
        System.out.println(this.name + " is eating " + dish);
    }

}
