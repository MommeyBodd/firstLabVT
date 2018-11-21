package by.bsuir.yaremchuk.task3.run;


import by.bsuir.yaremchuk.task3.reader.Reader;
import by.bsuir.yaremchuk.task3.util.Util;

import java.util.Map;

public class Runner {

    private static final int MIN_BOARDER = 0;
    private static final int MAX_BOARDER = 1;
    private static final int STEP = 2;

    public static Map<Double, Double> run() throws Exception {
        double[] inputArray = Reader.readValues();
        return Util.calculateFunction(inputArray[MIN_BOARDER],
                inputArray[MAX_BOARDER], inputArray[STEP]);
    }
}
