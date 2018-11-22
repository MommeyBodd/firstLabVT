package by.bsuir.yaremchuk.task6.creator;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CreatorTest {

    @Test
    public void createMatrix_SpecificArrayArg_CorrectMatrixReturned() {
        // arrange

        // act
        double[] sourceArray = { 1.0d, 2.0d, 3.0d };
        double[][] actual = Creator.createMatrix(sourceArray);

        double[][] expected = {
                { 1.0d, 2.0d, 3.0d },
                { 2.0d, 3.0d, 1.0d },
                { 3.0d, 1.0d, 2.0d }
        };

        // assert
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void createMatrix_EmptyArrayArg_EmptyMatrixReturned() {
        // arrange

        // act
        double[] sourceArray = { /* EMPTY */ };
        double[][] actual = Creator.createMatrix(sourceArray);

        double[][] expected = { /* EMPTY */ };

        // assert
        Assert.assertArrayEquals(expected, actual);
    }
}