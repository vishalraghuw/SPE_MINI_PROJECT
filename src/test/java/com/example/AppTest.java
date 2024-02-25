package com.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

public class AppTest {
    private static final double DELTA = 1e-15;
    App app = new App();

    @Test
    public void testFactorialWithPositiveNumbers() {
        assertEquals("Factorial of 5", 120, app.performFactorial(5), DELTA);
        assertEquals("Factorial of 4", 24, app.performFactorial(4), DELTA);
    }

    @Test
    public void testFactorialWithNegativeNumbers() {
        assertNotEquals("Factorial of 8", 10, app.performFactorial(8), DELTA);
        assertNotEquals("Factorial of 10", 2, app.performFactorial(10), DELTA);
    }

    @Test
    public void testPowerWithPositiveNumbers() {
        assertEquals("Power of 2^2", 4, app.performPower(2, 2), DELTA);
        assertEquals("Power of 5^1", 5, app.performPower(5, 1), DELTA);
    }

    @Test
    public void testPowerWithNegativeNumbers() {
        assertNotEquals("Power of 4^1", 8, app.performPower(4, 1), DELTA);
        assertNotEquals("Power of 2^2", -1, app.performPower(2, 2), DELTA);
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
        assertEquals("Square root of 4", 2, app.performSquareRoot(4), DELTA);
        assertEquals("Square root of 25", 5, app.performSquareRoot(25), DELTA);
    }

    @Test
    public void testSquareRootWithNegativeNumbers() {
        assertNotEquals("Square root of 25", 2, app.performSquareRoot(25), DELTA);
        assertNotEquals("Square root of 16", 2, app.performSquareRoot(16), DELTA);
    }
}
