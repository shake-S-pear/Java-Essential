package Lesson5.task2;

import java.util.ArrayList;

public class Zoo {

    public static void main(String[] args) {

        ArrayList <String> animals = new ArrayList<>();

        animals.add(0, "bear");
        animals.add(1, "fox");
        animals.add(2, "wolf");
        animals.add(3, "snake");
        animals.add(4, "elephant");
        animals.add(5, "tiger");
        animals.add(6, "lion");
        animals.add(7, "eagle");

        for (int i = 0; i < animals.size(); i++){
            System.out.println(animals.get(i));
        }
    }
}
