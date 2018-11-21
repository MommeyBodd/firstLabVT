package by.bsuir.yaremchuk.task5.reader;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public abstract class Reader {
    public static List<Integer> readArray() {
        Scanner scanner = new Scanner(System.in);
        List<Integer> inputArray = new ArrayList<Integer>();

        while (true) {
            String line = scanner.nextLine();
            if (line.length() < 1) {
                break;
            }
            String[] numbers = line.split(" ");
            for (String num : numbers) {
                int intValue = Integer.parseInt(num);
                inputArray.add(intValue);
            }
        }


        return inputArray;
    }

}

class A {
    static {
        System.out.print("static-A, ");
    }
    {
        System.out.print("init-A, ");
    }
    public A() {
        System.out.print("constructor-A, ");
    }
}

class B extends A {
    static {
        System.out.print("static-B, ");
    }
    {
        System.out.print("init-B, ");
    }
    public B(){
        System.out.print("Constructor-B, ");
    }
}

class Test {
    public static void main(String[] args) {
        new B();

    }
}
