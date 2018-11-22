package by.bsuir.yaremchuk.task1.calculator;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    private static final double DELTA = 0.01d;
    @Test
    public void shouldReturnHalfOfOneWhenInput_0and0() {
        // arrange
        double expectedResult = 0.5d;

        // act
        double actual = Calculator.calculateExpression(0, 0);

        // assert
        Assert.assertEquals(expectedResult, actual, DELTA);

    }

    @Test
    public void shouldReturn_1and91hundredths_WhenInput_0and0() {
        // arrange
        double expectedResult = 1.91d;

        // act
        double actual = Calculator.calculateExpression(1, 1);

        // assert
        Assert.assertEquals(expectedResult, actual, DELTA);
    }
}