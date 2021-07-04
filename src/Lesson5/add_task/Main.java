package Lesson5.add_task;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> teacherList = new ArrayList<>();

        teacherList.add("Ivan Ivanovych");
        teacherList.add("Maria Stepanivna");
        teacherList.add("Oleksiy Stepanovych");

        for (String somebody : teacherList){
            System.out.println(somebody);
        }
        System.out.println("- - - - - - - - - -");
        System.out.println("The best teacher is: " + teacherList.indexOf("Maria Stepanivna"));
        System.out.println("The worst teacher is: " + teacherList.indexOf("Ivan Ivanovych"));

    }

}
