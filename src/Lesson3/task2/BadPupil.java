package Lesson3.task2;

public class BadPupil extends Pupil{

    @Override
    public void read() {
        System.out.println("Bad reading skills.");
    }

    @Override
    public void study() {
        System.out.println("Bad studying skills.");
    }

    @Override
    public void relax() {
        System.out.println("Bad relaxing skills.");
    }

    @Override
    public void write() { System.out.println("Bad writing skills."); }
}
