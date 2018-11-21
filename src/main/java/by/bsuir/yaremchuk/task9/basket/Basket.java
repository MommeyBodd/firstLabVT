package by.bsuir.yaremchuk.task9.basket;

import by.bsuir.yaremchuk.task9.ball.Ball;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    private List<Ball> balls;

    public Basket() {
        this.balls = new ArrayList<Ball>();
    }

    public List<Ball> getBalls() {
        return balls;
    }

    public void addBall(Ball ball) {
        if (ball != null) {
            balls.add(ball);
        }
    }
}
