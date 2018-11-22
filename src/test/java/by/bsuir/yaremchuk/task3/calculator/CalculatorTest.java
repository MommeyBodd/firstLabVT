package by.bsuir.yaremchuk.task3.calculator;

import org.junit.Assert;
import org.junit.Test;

import java.util.Map;

public class CalculatorTest {

    private static final double LOWER_BOARD = 0.0;
    private static final double HIGHER_BOARD = Math.PI / 3;
    private static final double STEP = Math.PI / 6;
    private static final double DELTA = 0.01;

    @Test
    public void shouldReturnTrueIfInputIsLOWER_BOARDandHIGHER_BOARDandSTEP() {
        Map<Double, Double> actualTable = Calculator.calculateFunction(LOWER_BOARD, HIGHER_BOARD, STEP);
        double[] expected = { 0.0, 0.52, 1.05 };
        double[] actual = new double[actualTable.size()];
        int j = 0;
        boolean result = true;
        for (Double number :
                actualTable.keySet()) {
            actual[j++] = number;
        }
        for (int i = 0; i < expected.length; i++) {
            if (actual[i] - expected[i] > DELTA){
                result = false;
            }
        }

        Assert.assertTrue(result);
    }

    @Test
    public void shouldReturnFalseIfInputIsLOWER_BOARDandHIGHER_BOARDandSTEP() {
        Map<Double, Double> actualTable = Calculator.calculateFunction(LOWER_BOARD, HIGHER_BOARD, STEP);
        double[] expected = { 0.0, 0.20, 1.999 };
        double[] actual = new double[actualTable.size()];
        int j = 0;
        boolean result = true;
        for (Double number :
                actualTable.keySet()) {
            actual[j++] = number;
        }
        for (int i = 0; i < expected.length; i++) {
            if (actual[i] - expected[i] > DELTA){
                result = false;
            }
        }
        Assert.assertFalse(result);
    }
}