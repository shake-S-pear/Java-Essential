package Lesson3.task2;

public class Main {

    public static void main(String[] args) {

        ClassRoom classRoom = new ClassRoom (new BadPupil(), new BadPupil());

        classRoom.study();
        classRoom.read();
        classRoom.relax();
        classRoom.write();

    }
}
