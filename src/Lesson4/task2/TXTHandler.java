package Lesson4.task2;

public class TXTHandler extends AbstractHandler {

    public void open(){ System.out.println("The TXT file is open."); }

    public void create(){ System.out.println("The TXT file was created."); }

    public void change(){ System.out.println("The TXT file has been changed."); }

    public void save(){ System.out.println("The TXT file has been saved."); }

}
