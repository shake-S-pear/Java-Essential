package Lesson8.add_task;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Enter the first number: ");
        Scanner in1 = new Scanner(System.in);
        int a = in1.nextInt();

        System.out.println("Enter the second number: ");
        Scanner in2 = new Scanner(System.in);
        int b = in2.nextInt();

        System.out.println("Enter the operation on these two numbers (*, /, +, -): ");
        Scanner in3 = new Scanner(System.in);
        String operation = in3.next();

        switch (operation){
            case "+":
                System.out.println("The sum of these numbers is equals to: " + Calculator.add(a, b));
                break;
            case "-":
                System.out.println("The difference of these numbers is equals to: " + Calculator.sub(a, b));
                break;
            case "*":
                System.out.println("The result of multiplication of these numbers is equals to: " + Calculator.mul(a, b));
                break;
            case "/":
                System.out.println("The result of dividing of these numbers is equals to: " + Calculator.div(a, b));
                break;
            default:
                System.out.println("Be attentive, need to enter the correct operation on these two numbers (*, /, +, -) !");
                break;
        }

    }

}
