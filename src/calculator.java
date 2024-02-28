import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2, result;
        char operator;

        System.out.print("Enter the first number: ");
        while (!scanner.hasNextDouble()) {
            System.out.println("Error: Invalid input. Please enter a valid number.");
            scanner.next(); // Clear the invalid input
        }
        num1 = scanner.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        String inputOperator = scanner.next();
        while (inputOperator.length() != 1 || "+-*/".indexOf(inputOperator.charAt(0)) == -1) {
            System.out.println("Error: Invalid input. Please enter a valid operator (+, -, *, /).");
            inputOperator = scanner.next();
        }
        operator = inputOperator.charAt(0);

        System.out.print("Enter the second number: ");
        while (!scanner.hasNextDouble()) {
            System.out.println("Error: Invalid input. Please enter a valid number.");
            scanner.next(); // Clear the invalid input
        }
        num2 = scanner.nextDouble();

        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("Result: " + num1 + " + " + num2 + " = " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Result: " + num1 + " - " + num2 + " = " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Result: " + num1 + " * " + num2 + " = " + result);
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                } else {
                    result = num1 / num2;
                    System.out.println("Result: " + num1 + " / " + num2 + " = " + result);
                }
                break;
            default:
                System.out.println("Error: Invalid operator.");
                break;
        }

        scanner.close();
    }
}
