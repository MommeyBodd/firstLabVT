package by.bsuir.yaremchuk.task6.util;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.sqrt;

public class Util {

    public static double[] cyclicShift(double[] inputArray) {
        double[] outputArray = new double[inputArray.length];

        double startElement = inputArray[0];

        for (int i = 0; i < outputArray.length - 1; i++) {
            outputArray[i] = inputArray[i + 1];
        }

        outputArray[outputArray.length - 1] = startElement;

        return outputArray;
    }
}
