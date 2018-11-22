package by.bsuir.yaremchuk.task4.util;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class UtilTest {

    @Test
    public void shouldReturn_2and3_WhenInputSourceArray() {
        // arrange

        // act
        List<Integer> sourceArray = new ArrayList<>();
        sourceArray.add(1);
        sourceArray.add(4);
        sourceArray.add(3);
        sourceArray.add(7);

        List<Integer> actual = Util.findPositionOfPrimeNumber(sourceArray);
        List<Integer> expected = new ArrayList<>(Arrays.asList( 2, 3 ));

        // assert
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnTrueWhenInputEmptyList() {
        // arrange

        // act
        List<Integer> sourceArray = new ArrayList<>();
        List<Integer> actual = Util.findPositionOfPrimeNumber(sourceArray);
        List<Integer> expected = new ArrayList<>(/* EMPTY! */);

        // assert
        Assert.assertEquals(expected, actual);
    }

}