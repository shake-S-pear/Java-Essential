package Lesson3.task4;

public class ProDocumentWorker extends DocumentWorker{

    @Override
    public void editDocument() {
        System.out.println("The document has been edited.");
    }

    @Override
    public void saveDocument() {
        System.out.println("The document was saved in the old format, saving in other formats is available in the 'Expert' version.");
    }
}