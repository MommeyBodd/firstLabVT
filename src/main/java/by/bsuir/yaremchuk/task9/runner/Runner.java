package by.bsuir.yaremchuk.task9.runner;

import by.bsuir.yaremchuk.task9.ball.Ball;
import by.bsuir.yaremchuk.task9.basket.Basket;
import by.bsuir.yaremchuk.task9.enums.BallColors;
import by.bsuir.yaremchuk.task9.util.Util;

public class Runner {

    public static void run() {
        Basket basket = new Basket();

        basket.addBall(new Ball(BallColors.RED, 4.5d, 2.0d));
        basket.addBall(new Ball(BallColors.GREEN, 4.5d, 3.0d));
        basket.addBall(new Ball(BallColors.BLUE,  6.0d, 4.0d));
        basket.addBall(new Ball(BallColors.BLUE,  6.0d, 5.0d));
        basket.addBall(new Ball(BallColors.RED,   12.0d, 6.0d));

        System.out.println("Total weight = " + Util.getTotalWeight(basket));
        System.out.println("Blue balls count = " + Util.getCountByColor(basket, BallColors.BLUE));
    }

}
