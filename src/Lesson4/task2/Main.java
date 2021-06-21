package Lesson4.task2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        XMLHandler xmlHandler = new XMLHandler();
        TXTHandler txtHandler = new TXTHandler();
        DOCHandler docHandler = new DOCHandler();

        System.out.println("Please, enter the type of document: XML or TXT or DOC ?");
        Scanner in = new Scanner(System.in);
        String typeOfDocument = in.next();

        switch (typeOfDocument){
            case "XML":
                    xmlHandler.change();
                    xmlHandler.create();
                    xmlHandler.open();
                    xmlHandler.save();
                break;
            case "TXT":
                txtHandler.change();
                txtHandler.create();
                txtHandler.open();
                txtHandler.save();
                break;
            case "DOC":
                docHandler.change();
                docHandler.create();
                docHandler.open();
                docHandler.save();
                break;
            default:
                System.out.println("You only need to enter: XML or TXT or DOC. Be attentive.");
        }

    }
}
