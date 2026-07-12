public class Secret1 {
    private String name;
    private String password;
    private int age;
    private int result;

    public void Setter(String name, String password, int age) {
        this.name = name;
        this.password = password;
        this.age = age;
    }

    public void Getter() {
        int res = this.TopSecret();
        this.result = res;
        this.age = this.age + 1;
        System.out.println(this.name + " " + this.age + " ********");
    }

    private int TopSecret() {
        int a = 10;
        int b = 5;
        return a + b;
    }

    public String toString() {
        return this.name + " " + this.age + " ********";
    }

}
