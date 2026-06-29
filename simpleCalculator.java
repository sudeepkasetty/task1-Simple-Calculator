import java.util.Scanner;

public class simpleCalculator
{

    // Method for Addition
    public static double addition(double a, double b) {
        return a + b;
    }

    // Method for Subtraction
    public static double subtraction(double a, double b) {
        return a - b;
    }

    // Method for Multiplication
    public static double multiplication(double a, double b) {
        return a * b;
    }

    // Method for Division
    public static double division(double a, double b) {
        if (b == 0) {
            System.out.println("Error! Division by zero is not allowed.");
            return 0;
        }
        return a / b;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char choice;

        do {
            System.out.println("\n===== Simple Calculator =====");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.print("Enter your choice (1-4): ");
            int option = sc.nextInt();

            System.out.print("Enter first number: ");
            double num1 = sc.nextDouble();

            System.out.print("Enter second number: ");
            double num2 = sc.nextDouble();

            switch (option) {
                case 1:
                    System.out.println("Result = " + addition(num1, num2));
                    break;

                case 2:
                    System.out.println("Result = " + subtraction(num1, num2));
                    break;

                case 3:
                    System.out.println("Result = " + multiplication(num1, num2));
                    break;

                case 4:
                    System.out.println("Result = " + division(num1, num2));
                    break;

                default:
                    System.out.println("Invalid choice! Please select between 1 and 4.");
            }

            System.out.print("\nDo you want to perform another calculation? (Y/N): ");
            choice = sc.next().charAt(0);

        } while (choice == 'Y' || choice == 'y');

        System.out.println("Thank you for using the Calculator!");
        sc.close();
    }
}