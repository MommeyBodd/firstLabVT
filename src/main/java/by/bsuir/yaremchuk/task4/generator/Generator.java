package by.bsuir.yaremchuk.task4.generator;

import java.util.ArrayList;
import java.util.List;

public class Generator {
    private static final int MIN_BOARD = 0;
    private static final int MAX_BOARD = 100;


    public static List<Integer> generateArray(int size) {
        List<Integer> generatedArray = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            int newNumber = (int) (MIN_BOARD + Math.random() * MAX_BOARD);
            generatedArray.add(newNumber);
        }

        return generatedArray;

    }

}
