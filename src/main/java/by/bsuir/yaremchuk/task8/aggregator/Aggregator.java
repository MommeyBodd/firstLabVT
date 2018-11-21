package by.bsuir.yaremchuk.task8.aggregator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Aggregator {
    public static List<Integer> aggregateArrays(ArrayList<Integer> arrayFirst,
                                                ArrayList<Integer> arraySecond) {
        arrayFirst.addAll(arraySecond);
        arrayFirst.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });

        List<Integer> indexes = new ArrayList<>();

        for (Integer number : arraySecond) {
            int nextIndex = arrayFirst.indexOf(number);
            indexes.add(nextIndex);
        }

        return indexes;
    }
}
