package com.example.calculator;

import java.util.InputMismatchException;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CalculatorApp {

    private static final Logger logger = LogManager.getLogger(CalculatorApp.class);

    public CalculatorApp() {
    }

    public static void main(String[] args) {
        CalculatorApp app = new CalculatorApp();

        try (Scanner scanner = new Scanner(System.in)) {
            double num1, num2;

            do {
                System.out.println("Calculator Application\n");
                System.out.println("Choose an operation:");
                System.out.println("1. Factorial");
                System.out.println("2. Square root");
                System.out.println("3. Power");
                System.out.println("4. Natural Logarithm");
                System.out.println("5. Exit\n");
                System.out.print("Enter your choice: ");

                int choice;
                try {
                    choice = scanner.nextInt();
                } catch (InputMismatchException error) {
                    logger.error("Invalid input. Please enter a valid number.");
                    return;
                }

                switch (choice) {
                    case 1:
                        // Factorial
                        System.out.print("Enter a number: ");
                        num1 = scanner.nextDouble();
                        System.out.println("Factorial of " + num1 + " is: " + app.calculateFactorial(num1));
                        System.out.println();
                        break;

                    case 2:
                        // Square root
                        System.out.print("Enter a number: ");
                        num1 = scanner.nextDouble();
                        System.out.println("Square root of " + num1 + " is: " + app.calculateSquareRoot(num1));
                        System.out.println();
                        break;

                    case 3:
                        // Power
                        System.out.print("Enter the base number: ");
                        num1 = scanner.nextDouble();
                        System.out.print("Enter the exponent: ");
                        num2 = scanner.nextDouble();
                        System.out.println(num1 + " raised to the power of " + num2 + " is: " + app.calculatePower(num1, num2));
                        System.out.println();
                        break;

                    case 4:
                        // Natural logarithm
                        System.out.print("Enter a positive number: ");
                        num1 = scanner.nextDouble();
                        System.out.println("Natural logarithm of " + num1 + " is: " + app.calculateNaturalLog(num1));
                        System.out.println();
                        break;

                    case 5:
                        System.out.println("Exiting the calculator application.");
                        return;

                    default:
                        System.out.println("Invalid choice. Please enter a number between 1 and 5.");
                }
            } while (true);
        }
    }

    public double calculateFactorial(double number) {
        logger.info("[FACTORIAL] - " + number);
        double result = factorial(number);
        logger.info("[RESULT - FACTORIAL] - " + result);
        return result;
    }

    public double factorial(double num) {
        double factorial = 1;
        for (int i = 1; i <= num; ++i) {
            factorial *= i;
        }
        return factorial;
    }

    public double calculateSquareRoot(double number) {
        logger.info("[SQUARE ROOT] - " + number);
        double result = 0;
        try {
            if (number < 0) {
                throw new Exception("Cannot calculate square root of negative numbers.");
            }
            result = Math.sqrt(number);
        } catch (Exception error) {
            logger.error("[EXCEPTION] - " + error.getMessage());
            return Double.NaN;
        }
        logger.info("[RESULT - SQUARE ROOT] - " + result);
        return result;
    }

    public double calculatePower(double base, double exponent) {
        logger.info("[POWER - " + base + " RAISED TO] " + exponent);
        double result = Math.pow(base, exponent);
        logger.info("[RESULT - POWER] - " + result);
        return result;
    }

    public double calculateNaturalLog(double number) {
        logger.info("[NATURAL LOG] - " + number);
        double result = 0;
        try {
            if (number <= 0) {
                throw new Exception("Cannot calculate natural logarithm of non-positive numbers.");
            }
            result = Math.log(number);
        } catch (Exception error) {
            logger.error("[EXCEPTION] - " + error.getMessage());
            return Double.NaN;
        }
        logger.info("[RESULT - NATURAL LOG] - " + result);
        return result;
    }
}
