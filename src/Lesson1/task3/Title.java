package Lesson1.task3;

public class Title {

    private String title;

    public void show(){
        System.out.println("The title of this book is: " + title);
    }

    public void setTitle(String title) { this.title = title; }
}

//    Создать классы Title, Author и Content, каждый из которых должен
////        содержать одно строковое поле и метод void show ()