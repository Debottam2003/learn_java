// Primitive data types
// | Data Type | Size            | Default Value | Example                          |
// | --------- | --------------- | ------------- | -------------------------------- |
// | byte      | 1 byte          | 0             | byte age = 25;                   |
// | short     | 2 bytes         | 0             | short year = 2025;               |
// | int       | 4 bytes         | 0             | int salary = 50000;              |
// | long      | 8 bytes         | 0L            | long population = 8000000000L;   |
// | float     | 4 bytes         | 0.0f          | float price = 99.99f;            |
// | double    | 8 bytes         | 0.0d          | double pi = 3.14159;             |
// | char      | 2 bytes         | '\u0000'      | char grade = 'A';                |
// | boolean   | 1 bit           | false         | boolean isJavaFun = true;        |

// Java is Static typed language, which means that the type of a variable is known at compile time. 
// This allows for type checking and can help prevent errors in your code. 
// Each data type has a specific size and default value, which can be useful when declaring variables.

// Java is pure object-oriented programming language, which means that everything in Java is an object.

// C, golang, rust these all are procedural programming languages.

// c++, python, js these all are multi-paradigm programming languages(Procedural + Object Oriented).

public class Start {
    public static void main(String[] gagan) {
        // Example usage of different data types
        byte ageGagan = 25;
        short year = 2025;
        int salary = 50000;
        long population = 8000000000L;
        float price = 99.99f;
        double pi = 3.14159;
        char grade = 'A';
        boolean isJavaFun = true;

        // Keywords e.g. int, float, double, char, boolean, class, public, static, void,
        // etc.
        // are reserved words in Java and cannot be used as variable names.

        // Identifiers are names given to variables, methods, classes, etc. in Java.

        // Values are the actual data that is stored in variables. For example, in the
        // line "int salary = 50000;", the value is 50000.

        // int age; declaration of variable age of type int
        // age = 25; initialization of variable age with value 25
        // int age = 25; declaration and initialization of variable age of type int with
        // value 25 : definition

        // Print the values
        System.out.println("Age: " + ageGagan);
        System.out.println("Year: " + year);
        System.out.println("Salary: " + salary);
        System.out.println("Population: " + population);
        System.out.println("Price: " + price);
        System.out.println("Pi: " + pi);
        System.out.println("Grade: " + grade);
        System.out.println("Is Java Fun? " + isJavaFun);

        // Non-Primitive Data Types:

        // String
        // Arrays
        // Classes
        // Objects
        // Interfaces
        // Enums

        String name1 = "Gagan";
        String name2 = name1;
        System.out.println(name1);
        System.out.println(name2);

        int[] arr = { 1, 2, 3, 4, 5 };
        int[] arr2 = arr;
        arr[0] = 10;
        System.out.println(arr[0]);
        System.out.println(arr2[0]);
        arr2[2] = 333;
        System.out.println(arr[2]);
        System.out.println(arr2[2]);

        // Wrapper classes are used to convert primitive data types into objects.
        // Each primitive data type has a corresponding wrapper class in Java.
        // For example, the wrapper class for int is Integer, for double is Double, and
        // for boolean is Boolean.

        Integer intVal = Integer.parseInt("156");
        System.out.println(intVal);

    }
}
