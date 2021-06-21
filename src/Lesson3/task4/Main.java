package Lesson3.task4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Please, enter a key for the 'Expert' version:");
        Scanner inExpert = new Scanner(System.in);
        String keyExpert = inExpert.next();

        if (keyExpert.equals("key-expert-unlimited")) {

            ExpertDocumentWorker expertDocumentWorker = new ExpertDocumentWorker();
            System.out.println("Welcome to the 'Expert' version!");
            expertDocumentWorker.saveDocument();
            expertDocumentWorker.editDocument();
            expertDocumentWorker.openDocument();

        } else {
            System.out.println("Please, enter a key for the 'Pro' version:");
            Scanner inPro = new Scanner(System.in);
            String keyPro = inPro.next();

                if (keyPro.equals("key-pro-unlimited")) {

                    ProDocumentWorker proDocumentWorker = new ProDocumentWorker();
                    System.out.println("Welcome to the 'Pro' version!");
                    proDocumentWorker.saveDocument();
                    proDocumentWorker.editDocument();
                    proDocumentWorker.openDocument();

                } else {
                    DocumentWorker documentWorker = new DocumentWorker();
                    System.out.println("Welcome to the 'general' version!");
                    documentWorker.saveDocument();
                    documentWorker.editDocument();
                    documentWorker.openDocument();
                }
            }
        }
}
