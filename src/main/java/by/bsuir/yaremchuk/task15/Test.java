package by.bsuir.yaremchuk.task15;


import java.util.Date;
import java.util.Random;

class Dog {
    private String name;
    private String says;

    public Dog(String name, String says) {
        this.name = name;
        this.says = says;
    }

    public Dog() {

    }

    public String getName() {
        return name;
    }

    public String getSays() {
        return says;
    }
}

public class Test {

    private static final int MIN_BOARD = 1;
    private static final int MAX_BOARD = 100;


    public static void logicOperationWithString(String str1, String str2) {

        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
        System.out.println(str1 != str2);


    }

    public static void main(String[] args) {
        System.out.print("Hello: ");
        System.out.println(new Date() + "\n");

        Dog spot = new Dog("Spot", "I`m Spot");
        Dog scruffy = new Dog("Scruffy", "I`m Scruffy");
        Dog bobik = new Dog();

        System.out.println(spot.getName() + " says: " + spot.getSays());
        System.out.println(scruffy.getName() + " says: " + scruffy.getSays());

        Dog spudy = spot;

        System.out.println(spudy == spot);
        System.out.println(spudy.equals(spot));


        String s1 = new String("s");
        String s2 = new String("s");
        String s3 = "s";
        String s4 = "s";

        logicOperationWithString(s1, s2);
        System.out.println("-------------------------------");
        logicOperationWithString(s1, s3);
        System.out.println("-------------------------------");
        logicOperationWithString(s3, s4);
        System.out.println("-------------------------------");

//        int newNumber = getRandomNumber();
//        int previousNumber = newNumber;
//        int counter = 0;
//
//        while (counter != 25){
//            newNumber = getRandomNumber();
//
//            if (newNumber > previousNumber) {
//                print(newNumber + " more then " + previousNumber );
//            }
//            if (newNumber < previousNumber) {
//                print(newNumber + " less then " + previousNumber );
//            }
//            if (newNumber == previousNumber) {
//                print(newNumber + " equal to " + previousNumber );
//            }
//            counter++;
//            previousNumber = newNumber;
//        }


    }

    public static int getRandomNumber() {
        return (int) (MIN_BOARD + (Math.random() * MAX_BOARD));
    }

    public static void print(Object object) {
        System.out.println(object);
    }
}
