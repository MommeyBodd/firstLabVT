package by.bsuir.yaremchuk.task2.dot;

import org.junit.Assert;
import org.junit.Test;

public class DotTest {

    @Test
    public void shouldReturnTrueWhenInputIs4and5() {
        // act
        boolean actual = Dot.isInsideFigure(4, 5);

        // assert
        Assert.assertTrue(actual);
    }

    @Test
    public void shouldReturnFalseWhenInputIs10and3() {
        // act
        boolean actual = Dot.isInsideFigure(10, 3);

        // assert
        Assert.assertFalse(actual);
    }
}