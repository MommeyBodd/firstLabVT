package by.bsuir.yaremchuk.task5.run;

import by.bsuir.yaremchuk.task5.calculator.Calculator;
import by.bsuir.yaremchuk.task5.reader.Reader;

public class Runner {
    public static void run() {
        int[] sourceArray = Reader.readArray(5) ;
        System.out.print(Calculator.calculateCountWasteElements(sourceArray));
    }
}
