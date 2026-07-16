package Runtime;
// Runtime Polymorphism
class Parent {
    public Parent() {
        System.out.print("Parent ");
    }

    public void sleep() {
        System.out.print("Parent is Sleeping");
    }
}

class Child extends Parent {
    public Child() {
        System.out.print("Child");
    }

    @Override
    public void sleep() {
        System.out.print("Child is Sleeping");
    }
}

public class Main {
    public static void main(String[] args) {
        Parent p1 = new Child();
        p1.sleep();
    }
}