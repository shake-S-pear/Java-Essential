package Lesson7.task2;

public enum Animals {

    BEAR(23), WOLF(12), FOX(11), ELEPHANT(34), COW(8);

    String nameOfAnimal;
    int ageOfAnimal;

    Animals(int ageOfAnimal) {
        this.ageOfAnimal = ageOfAnimal;
    }

    public String toString(){
        return "Name is: " + name() + ",\n\t age is: " + this.ageOfAnimal;
    }
}



//    Создайте перечислительный тип (enum) Animals, содержащий конструктор, который должен принимать
//    целочисленное значение (возраст животного), и содержать перегруженный метод toString(), который
//    должен возвращать название экземпляра и возраст животного.