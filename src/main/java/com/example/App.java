package com.example;

import java.util.InputMismatchException;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App {

    private static final Logger logger = LogManager.getLogger(App.class);

    public App() {
    }

    public static void main(String[] args) {
        App app = new App();

        try (Scanner scanner = new Scanner(System.in)) {
            double num1, num2;

            do {
                System.out.println("Calculator using UMESH. \n Chse:");
                System.out.print("1. Factorial\n2. Square root\n3. Power\n4. Natural Logarithm\n" +
                        "5. Exit\nEnter your choice: ");

                int choice;
                try {
                    choice = scanner.nextInt();
                } catch (InputMismatchException error) {
                    return;
                }

                switch (choice) {
                    case 1:
                        // Factorial
                        System.out.print("Enter a number : ");
                        num1 = scanner.nextDouble();
                        System.out.println("Factorial of " + num1 + " is : " + app.factorial(num1));
                        System.out.println("\n");
                        break;

                    case 2:
                        // Square root
                        System.out.print("Enter a number : ");
                        num1 = scanner.nextDouble();
                        System.out.println("Square root of " + num1 + " is : " + app.squareRoot(num1));
                        System.out.println("\n");
                        break;

                    case 3:
                        // Power
                        System.out.print("Enter the first number : ");
                        num1 = scanner.nextDouble();
                        System.out.print("Enter the second number : ");
                        num2 = scanner.nextDouble();
                        System.out.println(num1 + " raised to power " + num2 + " is : " + app.power(num1, num2));
                        System.out.println("\n");
                        break;

                    case 4:
                        // Natural log
                        System.out.print("Enter a number : ");
                        num1 = scanner.nextDouble();
                        System.out.println("Natural log of " + num1 + " is : " + app.naturalLog(num1));
                        System.out.println("\n");
                        break;

                    default:
                        System.out.println("Exit");
                        return;
                }
            } while (true);
        }
    }

    public double factorial(double number1) {
        logger.info("[FACTORIAL] - " + number1);
        double result = fact(number1);
        logger.info("[RESULT - FACTORIAL] - " + result);
        return result;
    }

    public double fact(double num) {
        double facto = 1;
        for (int i = 1; i <= num; ++i) {
            facto *= i;
        }
        return facto;
    }

    public double squareRoot(double number1) {
        logger.info("[SQ ROOT] - " + number1);
        double result = 0;
        try {
            if (number1 < 0) {
                throw new Exception("Case of Imaginary Number");
            }
            result = Math.sqrt(number1);
        } catch (Exception error) {
            logger.error("[EXCEPTION - LOG] - Cannot find square root of negative numbers");
            return Double.NaN;
        }
        logger.info("[RESULT - SQ ROOT] - " + result);
        return result;
    }

    public double power(double number1, double number2) {
        logger.info("[POWER - " + number1 + " RAISED TO] " + number2);
        double result = Math.pow(number1, number2);
        logger.info("[RESULT - POWER] - " + result);
        return result;
    }

    public double naturalLog(double number1) {
        logger.info("[NATURAL LOG] - " + number1);
        double result = 0;
        try {

            if (number1 < 0) {
                result = Double.NaN;
                throw new ArithmeticException("Case of NaN 0.0/0.0");
            } else {
                result = Math.log(number1);
            }
        } catch (ArithmeticException error) {
            logger.error("[EXCEPTION - LOG] - Cannot find logarithm of negative numbers");
            return Double.NaN;
        }
        logger.info("[RESULT - NATURAL LOG] - " + result);
        return result;
    }
}


