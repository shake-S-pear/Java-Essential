package Lesson1.task4;

import java.util.Arrays;

public class ComputerEnter {

    public static void main(String[] args) {

        Computer [] computers = {
                new Computer("Apple"),
                new Computer("IBM"),
                new Computer("Intel"),
                new Computer("Dell"),
                new Computer("Nokia")
        };

        for (Computer i : computers){
            System.out.println(i.computerType);
        }
    }
}