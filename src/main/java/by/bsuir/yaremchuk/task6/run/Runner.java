package by.bsuir.yaremchuk.task6.run;


import by.bsuir.yaremchuk.task6.reader.Reader;
import by.bsuir.yaremchuk.task6.util.Util;

import java.util.List;

public class Runner {
    public static List<Integer> run(){
        List<Integer> inputArray = Reader.readArray();
        return Util.findPositionOfPrimeNumber(inputArray);
    }

}
