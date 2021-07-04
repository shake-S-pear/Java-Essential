package Lesson5.task4;

import java.util.ArrayList;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {

        ArrayList <Integer> intNumbers = new ArrayList<>();

        intNumbers.add(100);
        intNumbers.add(200);
        intNumbers.add(400);
        intNumbers.add(500);
        intNumbers.add(600);
        intNumbers.add(700);
        intNumbers.add(800);

        ListIterator <Integer> iterator = intNumbers.listIterator();

        while (iterator.hasNext()) {
            int s = iterator.next() + 1;
            System.out.println(s);
        }
    }
}
