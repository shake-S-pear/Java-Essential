package Lesson4.task2;

public class DOCHandler extends AbstractHandler {

    public void open(){ System.out.println("The DOC file is open."); }

    public void create(){ System.out.println("The DOC file was created."); }

    public void change(){ System.out.println("The DOC file has been changed."); }

    public void save(){ System.out.println("The DOC file has been saved."); }

}
