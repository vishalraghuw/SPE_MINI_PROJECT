package com.example.calculator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

/**
 * Unit test for CalculatorApp.
 */
public class CalculatorAppTest {
    private static final double DELTA = 1e-15;
    CalculatorApp calculator = new CalculatorApp();

    @Test
    public void testFactorialWithPositiveNumbers() {
        assertEquals("Factorial of 6", 720, calculator.factorial(6), DELTA);
        assertEquals("Factorial of 0", 1, calculator.factorial(0), DELTA);
    }

    @Test
    public void testFactorialWithNegativeNumbers() {
        assertNotEquals("Factorial of 5", 113, calculator.factorial(5), DELTA);
        assertNotEquals("Factorial of 6", 10, calculator.factorial(6), DELTA);
    }

    @Test
    public void testPowerWithPositiveNumbers() {
        assertEquals("Power of 3^4", 81, calculator.calculatePower(3, 4), DELTA);
        assertEquals("Power of 5^2", 25, calculator.calculatePower(5, 2), DELTA);
    }

    @Test
    public void testPowerWithNegativeNumbers() {
        assertNotEquals("Power of 2^3", 6, calculator.calculatePower(2, 3), DELTA);
        assertNotEquals("Power of 3^3", -7, calculator.calculatePower(3, 3), DELTA);
    }

    @Test
    public void testNaturalLogWithPositiveNumbers() {
        assertEquals("Natural log of 1", 0, calculator.calculateNaturalLog(1), DELTA);
        assertEquals("Natural log of e", 1, calculator.calculateNaturalLog(2.718281828459045), DELTA);
    }

    @Test
    public void testNaturalLogWithNegativeNumbers() {
        assertNotEquals("Natural log of 2.4", 60, calculator.calculateNaturalLog(2.4), DELTA);
        assertNotEquals("Natural log of 2.1", 4.7, calculator.calculateNaturalLog(2.1), DELTA);
    }

    @Test
    public void testSquareRootWithPositiveNumbers() {
        assertEquals("Square root of 16", 4, calculator.calculateSquareRoot(16), DELTA);
        assertEquals("Square root of 36", 6, calculator.calculateSquareRoot(36), DELTA);
    }

    @Test
    public void testSquareRootWithNegativeNumbers() {
        assertNotEquals("Square root of 3", 1, calculator.calculateSquareRoot(3), DELTA);
        assertNotEquals("Square root of 81", 4, calculator.calculateSquareRoot(81), DELTA);
    }
}
