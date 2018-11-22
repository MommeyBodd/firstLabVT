package by.bsuir.yaremchuk.task9.util;

import by.bsuir.yaremchuk.task9.ball.Ball;
import by.bsuir.yaremchuk.task9.basket.Basket;
import by.bsuir.yaremchuk.task9.enums.BallColors;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class UtilTest {


    private static final double DELTA = 0.1;

    @Test
    public void shouldReturnTwentyWhenInputBasketWithTotalWeightOfBallsTwenty() {
        Basket basket = new Basket();

        basket.addBall(new Ball(BallColors.RED, 4.5d, 2.0d));
        basket.addBall(new Ball(BallColors.GREEN, 4.5d, 3.0d));
        basket.addBall(new Ball(BallColors.BLUE,  6.0d, 4.0d));
        basket.addBall(new Ball(BallColors.BLUE,  6.0d, 5.0d));
        basket.addBall(new Ball(BallColors.RED,   12.0d, 6.0d));

        double actualWeight = Util.getTotalWeight(basket);

        double expected = 20.0d;

        Assert.assertEquals(expected, actualWeight, DELTA);
    }

    @Test
    public void shouldReturnZeroWhenInputBasketHaveNoBalls() {
        Basket basket = new Basket();

        /* No balls addition! */
        double actualWeight = Util.getTotalWeight(basket);

        double expected = 0.0d;

        Assert.assertEquals(expected, actualWeight, DELTA);
    }

    @Test
    public void shouldReturnTwoWhenInputBasketWithCountOfBlueBallsIsTwo() {
        Basket basket = new Basket();

        basket.addBall(new Ball(BallColors.RED, 4.5d, 2.0d));
        basket.addBall(new Ball(BallColors.GREEN, 4.5d, 3.0d));
        basket.addBall(new Ball(BallColors.BLUE,  6.0d, 4.0d));
        basket.addBall(new Ball(BallColors.BLUE,  6.0d, 5.0d));
        basket.addBall(new Ball(BallColors.RED,   12.0d, 6.0d));

        int actualResult = Util.getCountByColor(basket, BallColors.BLUE);
        int expected = 2;

        Assert.assertEquals(expected, actualResult);
    }

    @Test
    public void shouldReturnZeroWhenInputBasketHaveNoBlueBalls() {
        Basket basket = new Basket();

        /* No balls addition! */
        int actualResult = Util.getCountByColor(basket, BallColors.BLUE);

        int expected = 0;

        Assert.assertEquals(expected, actualResult);
    }
}