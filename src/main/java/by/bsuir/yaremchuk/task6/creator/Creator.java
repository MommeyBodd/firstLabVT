package by.bsuir.yaremchuk.task6.creator;

import by.bsuir.yaremchuk.task6.util.Util;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Creator {
    public static double[][] createMatrix(double[] inputArray) {
        int length = inputArray.length;
        double[] currentArrayState = inputArray;

        double[][] result = new double[length][length];

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                result[i][j] = currentArrayState[j];
            }

            currentArrayState = Util.cyclicShift(currentArrayState);
        }

        return result;
    }
}
