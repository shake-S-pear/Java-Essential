package Lesson6.add_task;

public class Main {

    public static void main(String[] args) {

        int x = 8;
        int y = 5;

        System.out.println("Summarizing: " + Calculator.addTwoNumbers(x, y));
        System.out.println("Subtracting: " + Calculator.subtractTwoNumbers(x, y));
        System.out.println("Multiplying: " + Calculator.multiplyTwoNumbers(x, y));
        System.out.println("Dividing: " + Calculator.divideTwoNumbers(x, y));

    }

}
