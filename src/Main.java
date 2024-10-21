import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter the first number (num1): ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter the second number (num2): ");
            double num2 = scanner.nextDouble();

            Calculator calc = new Calculator(num1, num2);

            System.out.println("Select an operation:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Addition: " + calc.add());
                    break;
                case 2:
                    System.out.println("Subtraction: " + calc.subtract());
                    break;
                case 3:
                    System.out.println("Multiplication: " + calc.multiply());
                    break;
                case 4:
                    try {
                        System.out.println("Division: " + calc.divide());
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    continue;
            }

            System.out.print("Do you want to perform another calculation? (yes to continue, no to exit): ");
            String response = scanner.next();
            if (response.equalsIgnoreCase("no")) {
                System.out.println("Exiting the program.");
                break;  // Exit the loop and program
            }
        }

        scanner.close();
    }
}