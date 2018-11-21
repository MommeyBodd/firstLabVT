package by.bsuir.yaremchuk.task9.ball;

import by.bsuir.yaremchuk.task9.enums.BallColors;

public class Ball {
    private BallColors color;
    private double radius;
    private double weight;

    public Ball(BallColors color, double radius, double weight) {
        this.color = color;
        this.radius = radius;
        this.weight = weight;
    }

    public BallColors getColor() {
        return color;
    }

    public double getRadius() {
        return radius;
    }

    public double getWeight() {
        return weight;
    }

}
