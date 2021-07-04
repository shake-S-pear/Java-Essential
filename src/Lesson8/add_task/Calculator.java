package Lesson8.add_task;

public class Calculator {

    private int a;
    private int b;

    public static int add (int a, int b){
        return a + b;
    }

    public static int sub (int a, int b){
        return a - b;
    }

    public static int mul (int a, int b){
        return a * b;
    }

    public static float div (int a, int b)
    {
        try {
            return a / b;
        } catch (ArithmeticException e0) {
            System.out.println(e0.getMessage());
        }
        return -1;
    }

}
