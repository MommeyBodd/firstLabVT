package by.bsuir.yaremchuk.task3.calculator;

import java.util.HashMap;
import java.util.Map;

public class Calculator {
    public static Map<Double, Double> calculateFunction(double lowerBoard,
                                                        double higherBoard,
                                                        double step)
            throws IllegalArgumentException {

        if (step > higherBoard - lowerBoard) {
            throw new IllegalArgumentException();
        }
        if (higherBoard <= lowerBoard) {
            throw new IllegalArgumentException();
        }

        Map<Double, Double> resultMap = new HashMap<Double, Double>();

        for (; lowerBoard <= higherBoard; lowerBoard += step) {
            double tangentsA = Math.tan(lowerBoard);
            resultMap.put(lowerBoard, tangentsA);
        }

        return resultMap;
    }
}
