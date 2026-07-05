public class MethodOverloading {
    public static void main(String[] args) {
        MethodOverloading ml1 = new MethodOverloading();
        ml1.addition(10, 20);
        ml1.addition(10.5, 20.5);
        ml1.addition(10, 20.5);
        ml1.addition(10, 20, 30);
        ml1.subtract(20, 10);
    }

    // Method Overloading: Same method name with different method signature
    // (different no of parameters or different types of parameters or different
    // order of parameters + same method name)

    public void addition(int a, int b) {
        System.out.println("Sum of two integers: " + (a + b));
    }

    // Method Overloading: Same method name with different types of parameters
    public void addition(double a, double b) {
        System.out.println("Sum of two doubles: " + (a + b));
    }

    public void addition(int a, double b) {
        System.out.println("Sum of integer and double: " + (a + b));
    }

    // Method Overloading: Same method name with different order of parameters
    public void addition(double b, int a) {
        System.out.println("Sum of integer and double: " + (a + b));
    }

    // Method Overloading: Same method name with different no of parameters
    public void addition(int a, int b, int c) {
        System.out.println("Sum of double and integer: " + (a + b + c));
    }

    public void subtract(int a, int b) {
        System.out.println("Subtraction of two integers: " + (a - b));
    }
}