package by.bsuir.yaremchuk.task5.reader;

import java.util.Scanner;

public class Reader {

    public static int[] readArray(int size) {
        int[] result = new int[size];

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < size; i++) {
            result[i] = input.nextInt();
        }

        return result;
    }



}

