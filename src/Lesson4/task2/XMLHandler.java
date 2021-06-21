package Lesson4.task2;

public class XMLHandler extends AbstractHandler {

    public void open(){ System.out.println("The XML file is open."); }

    public void create(){ System.out.println("The XML file was created."); }

    public void change(){ System.out.println("The XML file has been changed."); }

    public void save(){ System.out.println("The XML file has been saved."); }

}
