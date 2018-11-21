package by.bsuir.yaremchuk.task4.run;


import by.bsuir.yaremchuk.task4.reader.Reader;
import by.bsuir.yaremchuk.task4.util.Util;

import java.util.List;

public class Runner {
    public static List<Integer> run(){
        int arraySize = Reader.readArraySize();
        List<Integer> generatedArray = Util.generateArray(arraySize);
        return Util.findPositionOfPrimeNumber(generatedArray);
    }

}
