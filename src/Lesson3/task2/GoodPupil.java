package Lesson3.task2;

public class GoodPupil extends Pupil{

    @Override
    public void read() {
        System.out.println("Good reading skills.");
    }

    @Override
    public void study() {
        System.out.println("Good studying skills.");
    }

    @Override
    public void relax() {
        System.out.println("Good relaxing skills.");
    }

    public void write() {
        System.out.println("Good writing skills.");
    }
}
