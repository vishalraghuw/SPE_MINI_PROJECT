package com.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

public class AppTest {
    private static final double DELTA = 1e-15;
    App app = new App();

    @Test
    public void testFactorialWithPositiveNumbers() {
        assertEquals("Factorial of 6", 720, app.performFactorial(6), DELTA);
        assertEquals("Factorial of 0", 1, app.performFactorial(0), DELTA);
    }

    @Test
    public void testFactorialWithNegativeNumbers() {
        assertNotEquals("Factorial of 5", 113, app.performFactorial(5), DELTA);
        assertNotEquals("Factorial of 6", 10, app.performFactorial(6), DELTA);
    }

    @Test
    public void testPowerWithPositiveNumbers() {
        assertEquals("Power of 3^4", 81, app.performPower(3, 4), DELTA);
        assertEquals("Power of 5^2", 25, app.performPower(5, 2), DELTA);
    }

    @Test
    public void testPowerWithNegativeNumbers() {
        assertNotEquals("Power of 2^3", 6, app.performPower(2, 3), DELTA);
        assertNotEquals("Power of 3^3", -7, app.performPower(3, 3), DELTA);
    }

    @Test
    public void testNaturalLogWithPositiveNumbers() {
        assertEquals("Natural log of 1", 0, app.performNaturalLogarithm(1), DELTA);
        assertEquals("Natural log of e", 1, app.performNaturalLogarithm(2.718281828459045), DELTA);
    }

    @Test
    public void testNaturalLogWithNegativeNumbers() {
        assertNotEquals("Natural log of 2.4", 60, app.performNaturalLogarithm(2.4), DELTA);
        assertNotEquals("Natural log of 2.1", 4.7, app.performNaturalLogarithm(2.1), DELTA);
    }

    @Test
    public void testSquareRootWithPositiveNumbers() {
        assertEquals("Square root of 16", 4, app.performSquareRoot(16), DELTA);
        assertEquals("Square root of 36", 6, app.performSquareRoot(36), DELTA);
    }

    @Test
    public void testSquareRootWithNegativeNumbers() {
        assertNotEquals("Square root of 3", 1, app.performSquareRoot(3), DELTA);
        assertNotEquals("Square root of 81", 4, app.performSquareRoot(81), DELTA);
    }
}
