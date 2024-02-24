package com.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */

public class AppTest {
    private static final double DELTA = 1e-15;
    App app = new App();

    @Test
    public void testFactorialWithPositiveNumbers() {
        assertEquals("Factorial of 6", 720, app.fact(6), DELTA);
        assertEquals("Factorial of 0", 1, app.fact(0), DELTA);
    }

    @Test
    public void testFactorialWithNegativeNumbers() {
        assertNotEquals("Factorial of 5", 113, app.fact(5), DELTA);
        assertNotEquals("Factorial of 6", 10, app.fact(6), DELTA);
    }

    @Test
    public void testPowerWithPositiveNumbers() {
        assertEquals("Power of 3^4", 81, app.power(3, 4), DELTA);
        assertEquals("Power of 5^2", 25, app.power(5, 2), DELTA);
    }

    @Test
    public void testPowerWithNegativeNumbers() {
        assertNotEquals("Power of 2^3", 6, app.power(2, 3), DELTA);
        assertNotEquals("Power of 3^3", -7, app.power(3, 3), DELTA);
    }

    @Test
    public void testNaturalLogWithPositiveNumbers() {
        assertEquals("Natural log of 1", 0, app.naturalLog(1), DELTA);
        assertEquals("Natural log of e", 1, app.naturalLog(2.718281828459045), DELTA);
    }

    @Test
    public void testNaturalLogWithNegativeNumbers() {
        assertNotEquals("Natural log of 2.4", 60, app.naturalLog(2.4), DELTA);
        assertNotEquals("Natural log of 2.1", 4.7, app.naturalLog(2.1), DELTA);
    }

    @Test
    public void testSquareRootWithPositiveNumbers() {
        assertEquals("Square root of 16", 4, app.squareRoot(16), DELTA);
        assertEquals("Square root of 36", 6, app.squareRoot(36), DELTA);
    }

    @Test
    public void testSquareRootWithNegativeNumbers() {
        assertNotEquals("Square root of 3", 1, app.squareRoot(3), DELTA);
        assertNotEquals("Square root of 81", 4, app.squareRoot(81), DELTA);
    }
}
