package Lesson1.task3;

public class Book {

    public static void main(String[] args) {

        Title someTitle = new Title();
        someTitle.setTitle("The best picture");
        someTitle.show();

        Author someAuthor = new Author();
        someAuthor.setAuthor("Lesya Ukrainka");
        someAuthor.show();

        Content someContent = new Content();
        someContent.setContent("A lot of interesting information");
        someContent.show();

    }
}