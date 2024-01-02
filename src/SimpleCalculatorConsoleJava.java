import java.util.Scanner;




public class SimpleCalculatorConsoleJava {



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






    public static void exit() {
        System.exit(0);
    }

    public static void inputGateWay() {
        Scanner sc = new Scanner(System.in);
        int num1, num2;


        int choice;
        char yesNoChoice;
        do {

            System.out.println("\033[34m**********Simple Calculator**********\033[0m");


            System.out.print("\u001B[35m"); //Set the color =>> _m
            System.out.println("""
                    1. Addition
                    2. Subtract
                    3. Multiply
                    4. Divide
                    5. Exit
                    """);

            System.out.println("\u001B[0m"); // Reset color to default
            System.out.print("\u001B[32m");
            System.out.print("Enter First No.: ");
            num1 = sc.nextInt();

            System.out.print("\nEnter Second No.: ");
            num2 = sc.nextInt();

            System.out.print("\nEnter Your Choice: ");
            choice = sc.nextInt();
            System.out.println("\u001B[0m");

            switch (choice) {
                case 1 -> System.out.println("Addition: " + addition(num1, num2));
                case 2 -> System.out.println("Subtract: " + subtract(num1, num2));
                case 3 -> System.out.println("Multiply: " + multiply(num1, num2));
                case 4 -> System.out.println("Divide: " + divide(num1, num2));
                case 5 -> exit();
                default -> System.out.println("\033[31mWrong choice!!!\033[0m");
            }


            System.out.print("\033[36m\nDo you want to Calculate again? (y/n): \033[0m");
            yesNoChoice = sc.next().charAt(0);

        } while (yesNoChoice == 'y' || yesNoChoice == 'Y');


    }

    public static void main(String[] args) {

//        to display calculator design
        displayCalculator();
        System.out.println("");

        inputGateWay();




    }


    public static void displayCalculator() {
        System.out.println("""
                +-------------------------------------------+
                |                                           |
                |                                       8 9 |
                |                                           |
                +-------------------------------------------+
                |                                           |
                |       %          CE        C         E    |
                |                                           |
                |      1/x         x^2       !         /    |
                |                                           |
                |       7           8        9         X    |
                |                                           |
                |       4           5        6         -    |
                |                                           |
                |       1           2        3         +    |
                |                                           |
                |       +/-        0         .         =    |
                |                                           |
                +-------------------------------------------+
                """);


    }

}
