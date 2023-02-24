import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;


import org.junit.Test;
public class DifferenceOfSquaresCalculatorTest {
    DifferenceOfSquaresCalculator calculator;
    @Before
    public void setUp() {

        calculator = new DifferenceOfSquaresCalculator();
    }
    @Test
    public void testDifferenceOfSquaresUpToHundred() {
        int expected = 25164150;
        int actual = calculator.computeDifferenceOfSquares(100);
        assertEquals(expected, actual);
    }

}