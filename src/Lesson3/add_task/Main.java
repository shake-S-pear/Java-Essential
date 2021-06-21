package Lesson3.add_task;

public class Main {

    public static void main(String[] args) {

        Printer printer = new Printer();
        PrinterDerived printerDerived = new PrinterDerived();
        PrinterDerived2 printerDerived2 = new PrinterDerived2();
        PrinterDerived3 printerDerived3 = new PrinterDerived3();

        printer.print("123456789");
        printerDerived.print("123456789");
        printerDerived2.print("123456789");
        printerDerived3.print("123456789");

    }
}
