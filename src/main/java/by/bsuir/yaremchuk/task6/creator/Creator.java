package by.bsuir.yaremchuk.task6.reader;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Reader {
    public static List<Integer> readArray() {
        Scanner scanner = new Scanner(System.in);
        List<Integer> inputArray = new ArrayList<Integer>();

        while (scanner.hasNextInt()) {
            int nextValue = scanner.nextInt();
            inputArray.add(nextValue);
        }
        return inputArray;
    }
}
