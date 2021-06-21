package Lesson3.add_task;

public class PrinterDerived3 {

    public void print(String value){
        System.out.println((char) 27 + "[35m" + value);
    }
}
