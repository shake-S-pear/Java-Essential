package Lesson3.add_task;

public class PrinterDerived2 extends Printer{

    @Override
    public void print(String value) {
        System.out.println((char) 27 + "[33m" + value);
    }
}
