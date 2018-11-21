package by.bsuir.yaremchuk.task7.sorter;

public class Sorter {

    private static void swap(float[] sourceArray, int index1, int index2){
        float temp = sourceArray[index1];
        sourceArray[index1] = sourceArray[index2];
        sourceArray[index2] = temp;
    }

    public static void sort(float[] sourceArray) {
        int i = 0;
        while (i < sourceArray.length - 1) {
            if (sourceArray[i] <= sourceArray[i + 1]) {
                i++;
            } else {
                swap(sourceArray, i, i + 1);
                if (i != 0) {
                    i--;
                }
            }
        }
    }
}
