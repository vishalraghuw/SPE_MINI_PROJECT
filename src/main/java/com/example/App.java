import org.example.Main;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MainTest {

    private Main calculator;

    @Before
    public void setUp() {
        calculator = new Main();
    }

    @After
    public void tearDown() {
        calculator = null;
    }

    @Test
    public void testAddition() {
        assertEquals(5.0, calculator.performAddition(2.0, 3.0), 0.001);
    }

    @Test
    public void testSubtraction() {
        assertEquals(2.0, calculator.performSubtraction(5.0, 3.0), 0.001);
    }

    @Test
    public void testMultiplication() {
        assertEquals(15.0, calculator.performMultiplication(3.0, 5.0), 0.001);
    }

    @Test
    public void testDivision() {
        assertEquals(2.5, calculator.performDivision(5.0, 2.0), 0.001);
    }

    @Test
    public void testSquareRoot() {
        assertEquals(2.0, calculator.performSquareRoot(4.0), 0.001);
    }


    @Test
    public void testNaturalLogarithm() {
        assertEquals(0.0, calculator.performNaturalLogarithm(1.0), 0.001);
    }

    @Test
    public void testPower() {
        assertEquals(8.0, calculator.performPower(2.0, 3.0), 0.001);
    }
}
