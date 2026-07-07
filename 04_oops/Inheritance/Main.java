public class Main {
    public static void main(String[] args) {
        System.out.println("Inheritance");
        Super sp1 = new Super("gagan", 24, "male", "india");
        sp1.introduce();
        sp1.eat();
        sp1.sleep();
        Sub sb1 = new Sub("debottam", 24, "male", "india", "cricket");
        sb1.introduce();
        sb1.eat();
        sb1.eat("biriyani");
        sb1.sleep();
    }
}