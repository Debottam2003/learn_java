public class Call {
    public static void main(String[] args) {
        // Secret1 sc1 = new Secret1("Debottam", "hola-gomostas", 23);
        // System.out.println(sc1.password);
        // sc1.Details();
        Secret2 sc2 = new Secret2("Debottam", "hola-gomostas", 23);
        sc2.age = sc2.age + 1;
        System.out.println(sc2.password);
        sc2.Details();
        Secret1 sc1 = new Secret1();
        sc1.Setter("Debottam", "hola-gomostas", 23);
        sc1.Getter();
        // sc1.age = sc1.age + 1;
        System.out.println(sc1);
    }
}
