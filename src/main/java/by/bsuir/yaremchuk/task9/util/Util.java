package by.bsuir.yaremchuk.task9.util;

import by.bsuir.yaremchuk.task9.ball.Ball;
import by.bsuir.yaremchuk.task9.basket.Basket;
import by.bsuir.yaremchuk.task9.enums.BallColors;

public class Util {
    public static float getTotalWeight(Basket basket) {
        float totalWeight = 0;

        for (Ball ball : basket.getBalls()) {
            totalWeight += ball.getWeight();
        }

        return totalWeight;
    }

    public static int getCountByColor(Basket basket, BallColors color) {
        int count = 0;
        for (Ball ball : basket.getBalls()) {
            if (ball.getColor() == color) {
                count++;
            }
        }
        return count;
    }
}
