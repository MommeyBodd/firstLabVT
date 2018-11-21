package by.bsuir.yaremchuk.task1.calculator;

public class Calculator {

    public static double calculateExpression(double x, double y) {
        return (1 + Math.pow(Math.sin(x + y), 2)) /
                (2 + Math.abs(x - (2 * x) / (1 + Math.pow(x, 2) * Math.pow(y, 2)))) + x;
    }
}
