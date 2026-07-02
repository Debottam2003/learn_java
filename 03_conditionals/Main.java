public class Main {
    public static void main(String[] args) {
        int number = 10;

        // Check if the number is positive, negative, or zero
        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }

        switch (number) {
            case 1:
                System.out.println("The number is one.");
                break;
            case 10:
                System.out.println("The number is ten.");
                break;
            default:
                System.out.println("The number is neither one nor ten.");
        }

    }
}
