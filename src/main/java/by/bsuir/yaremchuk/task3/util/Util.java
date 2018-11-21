package by.bsuir.yaremchuk.task3.util;

import java.util.HashMap;
import java.util.Map;

public class Util {
    public static Map<Double, Double> calculateFunction(double a, double b, double h) throws Exception {
        if (h > b - a) {
            throw new Exception();
        }
        Map<Double, Double> resultMap = new HashMap<Double, Double>();

        for (; a <= b; a += h) {
            double tangentsA = Math.tan(a);
            resultMap.put(a, tangentsA);
        }

        return resultMap;
    }
}
