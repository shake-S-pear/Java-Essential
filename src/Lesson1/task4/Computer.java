package Lesson1.task4;

public class Computer {

    String computerType;

    Computer(String computerType){
        this.computerType = computerType;
    }

    public void setComputerType(String computerType) { this.computerType = computerType; }

    public String getComputerType() {
        return computerType;
    }

}


//    Задание 4
//    Используя IDEA, создайте проект с пакетом. Создать класс Computer, создать массив объектов
//    Computers размером 5. Далее руками создать 5 экземпляров этого класса и записать в компьютер
//    (используя loop)
