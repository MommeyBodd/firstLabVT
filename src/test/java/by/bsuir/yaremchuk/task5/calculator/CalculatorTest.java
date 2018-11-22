package by.bsuir.yaremchuk.task5.calculator;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void analyze_SpecificArrayArg_CorrectAnswerReturned() {

        int actual = Calculator.calculateCountWasteElements(new int[] { 1, 2, 10, 4 , 5 });
        int expected = 1;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void analyze_AscendingSequenceArg_ZeroReturned() {

        int actual = Calculator.calculateCountWasteElements(new int[] { 1, 2, 3, 4 , 5 });
        int expected = 0;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void analyze_EmptyArrayArg_Minus1Returned() {

        int actual = Calculator.calculateCountWasteElements(new int[] {});
        int expected = -1;

        Assert.assertEquals(expected, actual);
    }
}