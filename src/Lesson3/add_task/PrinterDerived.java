package Lesson3.add_task;

public class PrinterDerived extends Printer{

    @Override
    public void print(String value) {
        System.out.println((char) 27 + "[31m" + value);
    }
}
