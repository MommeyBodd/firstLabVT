package by.bsuir.yaremchuk.task5.run;


import by.bsuir.yaremchuk.task5.reader.Reader;
import by.bsuir.yaremchuk.task5.util.Util;

import java.util.*;


public class Runner {
    public static List<Integer> run(){
        List<Integer> inputArray = Reader.readArray();
        return Util.findPositionOfPrimeNumber(inputArray);
    }

    static void merge(ArrayList<Integer> a, ArrayList<Integer> b) {
        for (int i = 0, j = 0; j < b.size(); i++) {
            if (i == a.size() || a.get(i) > b.get(j)) {
                a.add(i, b.get(j++));
            }
        }
        System.out.println(a);
        System.out.println(b);
    }

    public static void main(String[] args) {
        ArrayList<Integer> arrayA = new ArrayList<>();
        arrayA.add(1);
        arrayA.add(3);
        arrayA.add(5);
        ArrayList<Integer> arrayB = new ArrayList<>();
        arrayB.add(2);
        arrayB.add(4);
        arrayB.add(6);
        merge(arrayA, arrayB);
    }


}
