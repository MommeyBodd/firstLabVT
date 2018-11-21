package by.bsuir.yaremchuk.task5.util;

public class Util {

    public static int calculateCount(int[] inputArray) {
        int[] sequence = new int[inputArray.length];

        for (int i = 0; i < inputArray.length; i++) {
            sequence[i] = 1;

            for (int j = 0; j < i; j++) {
                if (inputArray[j] < inputArray[i]) {
                    sequence[i] = Math.max(sequence[i], sequence[j] + 1);
                }
            }
        }

        int maximumLength = 1;

        for (int i = 0; i < sequence.length; i++) {
            maximumLength = Math.max(maximumLength, sequence[i]);
        }

        return sequence.length - maximumLength;
    }
}
