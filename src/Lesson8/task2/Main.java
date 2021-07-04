package Lesson8.task2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Worker [] listOfWorkers = new Worker[5];
        String nameSurname;
        String jobTitle;
        int yearOfStartWorking;
        int currentYear = 2021;

        for (int i = 0; i < listOfWorkers.length; i++) {
            int n = i +1;
            System.out.println("Enter the name and surname of " + n + " worker: ");
            Scanner in1 = new Scanner(System.in);
            nameSurname = in1.next();

            System.out.println("Enter the job title of " + n + " worker: ");
            Scanner in2 = new Scanner(System.in);
            jobTitle = in2.next();

            try {
                System.out.println("Enter the year of start working of " + n + " worker: ");
                Scanner in3 = new Scanner(System.in);
                yearOfStartWorking = in3.nextInt();
            } catch (Exception e1) {
                System.out.println("\tError: " + e1.getMessage());
                System.out.println("\tThis value is not a year.");
                yearOfStartWorking = currentYear;
            }

            listOfWorkers[i] = new Worker(nameSurname, jobTitle, yearOfStartWorking);

        }

        System.out.println("- - - - - - - - - - - - - - -");

        for (Worker somebody : listOfWorkers){
            System.out.println(somebody.getNameSurname() + " " + somebody.getJobTitle() + " " + somebody.getYearOfStartWorking());
        }

        System.out.println("- - - - - - - - - - - - - - -");

        System.out.println("Enter the number of work experience: ");
        Scanner in4 = new Scanner(System.in);
        int workExperience = in4.nextInt();

        System.out.println("List of workers who work more than " + workExperience + " years: ");

        for (int i = 0; i < listOfWorkers.length; i++) {
            if ((currentYear - listOfWorkers[i].yearOfStartWorking) > workExperience) {
                System.out.println(listOfWorkers[i].getNameSurname());
            }
        }

        System.out.println("- - - - - - - - - - - - - - -");

        Arrays.sort(listOfWorkers, new SortWorkersByName());

        System.out.println("Sorted array by name: ");

        for (Worker somebody : listOfWorkers){
            System.out.println(somebody.getNameSurname() + " " + somebody.getJobTitle() + " " + somebody.getYearOfStartWorking());
        }

        System.out.println("- - - - - - - - - - - - - - -");
    }

}