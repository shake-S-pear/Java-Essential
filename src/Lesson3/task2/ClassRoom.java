package Lesson3.task2;

public class ClassRoom {

    Pupil pupil1;
    Pupil pupil2;
    Pupil pupil3;
    Pupil pupil4;

    public ClassRoom (Pupil pupil1, Pupil pupil2, Pupil pupil3, Pupil pupil4){
        this.pupil1 = pupil1;
        this.pupil2 = pupil2;
        this.pupil3 = pupil3;
        this.pupil4 = pupil4;
    }

    public ClassRoom (Pupil pupil1, Pupil pupil2) {
        this.pupil1 = pupil1;
        this.pupil2 = pupil2;
        this.pupil3 = new GoodPupil();
        this.pupil4 = new GoodPupil();
    }

    public ClassRoom (Pupil pupil1, Pupil pupil2, Pupil pupil3) {
        this.pupil1 = pupil1;
        this.pupil2 = pupil2;
        this.pupil3 = pupil3;
        this.pupil4 = new BadPupil();
    }

    public void study(){
        System.out.println("       Studying skills: ");
        this.pupil1.study();
        this.pupil2.study();
        this.pupil3.study();
        this.pupil4.study();
        System.out.println("- - - - - - - - - - - - - - - - - -");
    }

    public void read(){
        System.out.println("       Reading skills: ");
        this.pupil1.read();
        this.pupil2.read();
        this.pupil3.read();
        this.pupil4.read();
        System.out.println("- - - - - - - - - - - - - - - - - -");
    }

    public void relax(){
        System.out.println("       Relaxing skills: ");
        this.pupil1.relax();
        this.pupil2.relax();
        this.pupil3.relax();
        this.pupil4.relax();
        System.out.println("- - - - - - - - - - - - - - - - - -");
    }

    public void write(){
        System.out.println("       Writing skills: ");
        this.pupil1.write();
        this.pupil2.write();
        this.pupil3.write();
        this.pupil4.write();
        System.out.println("- - - - - - - - - - - - - - - - - -");
    }


}

//    Требуется:
//    Создать класс, представляющий учебный класс ClassRoom.
//    Создайте класс ученик Pupil. В теле класса создайте методы void study(), void read(), void write(), void relax().
//    Создайте 3 производных класса ExcellentPupil, GoodPupil, BadPupil от класса базового класса Pupil и
//    переопределите каждый из методов, в зависимости от успеваемости ученика.
//    Конструктор класса ClassRoom принимает аргументы типа Pupil, класс должен состоять из 4 учеников.
//    Предусмотрите возможность того, что пользователь может передать 2 или 3 аргумента.
//    Выведите информацию о том, как все ученики экземпляра класса ClassRoom умеют учиться, читать, писать,
//    отдыхать.