public class Secret2 {
    public String name;
    public String password;
    public int age;

    public Secret2(String name, String password, int age) {
        this.name = name;
        this.password = password;
        this.age = age;
    }

    public void Details() {
        System.out.println(this.name + this.age);
    }

}
