public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        m.sum(10, 5);
        m.sum(10, 20, 30);
        m.sum(5.5, 2.2);
    }

    public void sum(int a, int b) {
        System.out.println(a + b);
    }

    public void sum(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    public void sum(double a, double b) {
        System.out.println(a + b);
    }
}
