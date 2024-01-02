import java.util.Scanner;
/**
 * System.out.println("\033[31mThis text is red.\033[0m");
 * 30: Black
 * 31: Red
 * 32: Green
 * 33: Yellow
 * 34: Blue
 * 35: Magenta
 * 36: Cyan
 * 37: White
 * <p>
 * <p>
 * System.out.print("\u001B[32m"); // Set text color to green
 * System.out.print("Enter your name: ");
 * Scanner scanner = new Scanner(System.in);
 * String name = scanner.nextLine();
 * System.out.println("\u001B[0m"); // Reset color to default
 */


public class ArithmeticOperatorsCalculator {


    public static int addition(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public static float divide(int num1, int num2) {
        try {

            return ((float) num1 / num2);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }

    public static int modulus(int num1, int num2) {
        return num1 % num2;
    }

    public static String increment(int num1, int num2) {
        return "num1: " + num1++ + "num2: " + num2++;
    }

    public static String decrement(int num1, int num2) {
        return "num1: " + num1-- + "num2: " + num2--;
    }

    public static void inputGateWay() {
        Scanner sc = new Scanner(System.in);
        int num1, num2;


        int choice;
     char yesNoChoice;
        do {

            System.out.println("**********Simple Calculator**********");
            System.out.println("""
                    1. Addition
                    2. Subtract
                    3. Multiply
                    4. Divide
                    5. Modulus
                    6. Increment
                    7. Decrement
                    """);

            System.out.print("Enter First No.: ");
            num1 = sc.nextInt();

            System.out.print("\nEnter Second No.: ");
            num2 = sc.nextInt();

            System.out.print("\nEnter Your Choice: ");
             choice = sc.nextInt();


            switch (choice) {

                case 1:
                    System.out.println("Addition: " + addition(num1, num2));
                    break;

                case 2:
                    System.out.println("Subtract: " + subtract(num1, num2));
                    break;

                case 3:
                    System.out.println("Multiply: " + multiply(num1, num2));
                    break;

                case 4:
                    System.out.println("Divide: " + divide(num1, num2));
                    break;

                case 5:
                    System.out.println("Modulus: " + modulus(num1, num2));
                    break;

                case 6:
                    System.out.println("Increment: " + increment(num1, num2));
                    break;

                case 7:
                    System.out.println("Decrement: " + decrement(num1, num2));
                    break;
                default:
                    System.out.println("Wrong Input");
            }


            System.out.print("Do you want to Calculate again? (y/n): ");
             yesNoChoice = sc.next().charAt(0);

        } while (yesNoChoice =='y' || yesNoChoice =='Y' );



    }

    public static void main(String[] args) {
        inputGateWay();

    }

}
