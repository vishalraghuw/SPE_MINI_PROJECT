package com.example;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Calculator!");

        while (true) {
            // Displaying operation choices
            System.out.println("select the operation:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Square Root");
            System.out.println("6. Factorial");
            System.out.println("7. Natural Logarithm");
            System.out.println("8. Power");
            System.out.println("9. Exit");

            int choice = scanner.nextInt();

            if (choice == 9) {
                System.out.println("Exiting the calculator. Goodbye!");
                break; // Exit the loop and end the program
            }

            performOperation(choice, scanner);
        }

        scanner.close();
    }

    public static void performOperation(int choice, Scanner scanner) {
        double num1, num2;
        switch (choice) {
            case 1:
                System.out.println("Enter first number:");
                num1 = scanner.nextDouble();
                System.out.println("Enter second number:");
                num2 = scanner.nextDouble();
                System.out.println(performAddition(num1, num2));
                break;
            case 2:
                System.out.println("Enter first number:");
                num1 = scanner.nextDouble();
                System.out.println("Enter second number:");
                num2 = scanner.nextDouble();
                System.out.println(performSubtraction(num1, num2));
                break;
            case 3:
                System.out.println("Enter first number:");
                num1 = scanner.nextDouble();
                System.out.println("Enter second number:");
                num2 = scanner.nextDouble();
                System.out.println(performMultiplication(num1, num2));
                break;
            case 4:
                System.out.println("Enter first number:");
                num1 = scanner.nextDouble();
                System.out.println("Enter second number:");
                num2 = scanner.nextDouble();
                System.out.println(performDivision(num1, num2));
                break;
            case 5:
                System.out.println("Enter number:");
                num1 = scanner.nextDouble();
                System.out.println(performSquareRoot(num1));
                break;
            case 6:
                System.out.println("Enter number:");
                num1 = scanner.nextDouble();
                System.out.println(performFactorial(num1));
                break;
            case 7:
                System.out.println("Enter number:");
                num1 = scanner.nextDouble();
                System.out.println(performNaturalLogarithm(num1));
                break;
            case 8:
                System.out.println("Enter base:");
                num1 = scanner.nextDouble();
                System.out.println("Enter exponent:");
                num2 = scanner.nextDouble();
                System.out.println(performPower(num1, num2));
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }

    public static double performAddition(double v, double v1) {
        return v + v1;
    }

    public static double performSubtraction(double v, double v1) {
        return v - v1;
    }

    public static double performMultiplication(double v, double v1) {
        return v * v1;
    }

    public static double performDivision(double v, double v1) {
        return v / v1;
    }

    public static double performSquareRoot(double v) {
        return Math.sqrt(v);
    }

    public static double performFactorial(double v) {
        if (v < 0) {
            return 1;
        } else {
            double result = 1;
            for (int i = 2; i <= v; i++) {
                result *= i;
            }
            return result;
        }
    }

    public static double performNaturalLogarithm(double v) {
        if (v <= 0) {
            return 0;
        } else {
            return Math.log(v);
        }
    }

    public static double performPower(double v, double v1) {
        return Math.pow(v, v1);
    }
}
