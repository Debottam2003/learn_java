public class Logical {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        // Logical AND
        System.out.println("a AND b: " + (a && b)); // false

        // Logical OR
        System.out.println("a OR b: " + (a || b)); // true

        // Logical NOT
        System.out.println("NOT a: " + (!a)); // false
        System.out.println("NOT b: " + (!b)); // true
    }
}
// logical operators

// OR
// t + t = t
// t + f = t
// f + t = t
// f + f = f

// AND
// t * t = t
// t * f = f
// f * t = f
// f * f = f

// NOT
// !t = f
// !f = t
