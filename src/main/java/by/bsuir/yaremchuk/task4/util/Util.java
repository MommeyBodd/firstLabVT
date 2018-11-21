package by.bsuir.yaremchuk.task4.util;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.sqrt;

public class Util {

    private static final int MIN_BOARD = 0;
    private static final int MAX_BOARD = 100;

    public static List<Integer> findPositionOfPrimeNumber(List<Integer> inputArray) {
        List<Integer> positionsOfPrimeNumber = new ArrayList<>();
        for (Integer number : inputArray){
            if (isPrime(number)) {
                positionsOfPrimeNumber.add(number);
            }
        }
        return positionsOfPrimeNumber;
    }

    private static boolean isPrime(int number){
        if (number < 2)
            return false;
        double squareRoot = sqrt(number);
        for (int i = 2; i <= squareRoot; i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }

    public static List<Integer> generateArray(int size) {
        List<Integer> generatedArray = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            int newNumber = (int) (MIN_BOARD + Math.random() * MAX_BOARD);
            generatedArray.add(newNumber);
        }

        return generatedArray;

    }
}
