package org.example;

import java.util.Scanner;

public class Main {

    public static void Main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Basic Calculator!");

        // Displaying operation choices
        System.out.println("Please select the operation you want to perform:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Square Root");
        System.out.println("6. Factorial");
        System.out.println("7. Natural Logarithm");
        System.out.println("8. Power");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter first number:");
                double num1 = scanner.nextDouble();
                System.out.println("Enter second number:");
                double num2 = scanner.nextDouble();

                System.out.println(performAddition(num1, num2));
                break;
            case 2:
                System.out.println("Enter first number:");
                double num3 = scanner.nextDouble();
                System.out.println("Enter second number:");
                double num4 = scanner.nextDouble();
                System.out.println(performSubtraction(num3,num4));
                break;
            case 3:
                System.out.println("Enter first number:");
                double num5 = scanner.nextDouble();
                System.out.println("Enter second number:");
                double num6 = scanner.nextDouble();
                System.out.println(performMultiplication(num5,num6));
                break;
            case 4:
                System.out.println("Enter first number:");
                double num7 = scanner.nextDouble();
                System.out.println("Enter second number:");
                double num8 = scanner.nextDouble();
                System.out.println(performDivision(num7,num8));
                break;
            case 5:
                System.out.println("Enter first number:");
                double num9 = scanner.nextDouble();
                System.out.println(performSquareRoot(num9));
                break;
            case 6:
                System.out.println("Enter first number:");
                double num10 = scanner.nextDouble();
                System.out.println(performFactorial(num10));
                break;
            case 7:
                System.out.println("Enter first number:");
                double num11 = scanner.nextDouble();
                System.out.println(performNaturalLogarithm(num11));
                break;
            case 8:
                System.out.println("Enter first number:");
                double num12 = scanner.nextDouble();
                System.out.println("Enter second number:");
                double num13 = scanner.nextDouble();
                System.out.println(performPower(num12,num13));
                break;
            default:
                System.out.println("Invalid choice!");
        }

        scanner.close();
    }

    public static double performAddition(double v, double v1) {



        double result = v + v1;
        return result;
    }

    public static double performSubtraction(double v, double v1){
        double result = v - v1;
        return result;
    }

    public static double performMultiplication(double v, double v1) {
        double result = v * v1;
        return result;
    }

    public static double performDivision(double v, double v1) {
        double result = v / v1;
        return result;
    }
    public static double performSquareRoot(double v) {
        double result = Math.sqrt(v);
        return result;
    }

    public static double performFactorial(double v) {
        if (v < 0) {
            return 1;
        } else {
            int result = 1;
            for (int i = 2; i <= v; i++) {
                result *= i;
            }
            return +result;
        }
    }

    public static double performNaturalLogarithm(double v){
        if (v <= 0) {
            return 0;
        } else {
            double result = Math.log(v);
            return +result;
        }
    }

    public static double performPower(double v, double v1){
        double result = Math.pow(v,v1);
        return result;
    }
}
