package by.bsuir.yaremchuk.task2.figure;

public class Figure {
    public static boolean isInside(int x, int y) {
        return ((x >= -4 && x <= 4 && y >= 0 && y <= 5) ||
                (x >= -6 && x <= 6 && y >= -3 && y <= 0));
    }
}
