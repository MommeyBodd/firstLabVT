package by.bsuir.yaremchuk.task6.util;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.sqrt;

public class Util {

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
}
