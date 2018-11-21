package by.bsuir.yaremchuk.task3.reader;

import java.util.Scanner;

public class Reader {
    public static double[] readValues() {
        Scanner scanner = new Scanner(System.in);
        double[] inputArray = new double[3];
        for(int i = 0; i < inputArray.length; i++){
            inputArray[i] = Double.parseDouble(scanner.next());
        }
        return inputArray;
    }
}
