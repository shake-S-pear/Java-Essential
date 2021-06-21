package Lesson9.add_task;

public class Animal {

    private String name;
    private int age;
    private boolean tail;

    public Animal(String name, int age, Boolean tail){
        this.name = name;
        this.age = age;
        this.tail = tail;
    }

    public String toString(){
        return "Name is: " + this.name + " , age is: " + this.age + " , tail: " + this.tail;
    }

    public boolean equals (Object obj){
        if (obj.getClass() == Animal.class){
            Animal a = (Animal) obj;
            boolean isName = a.name.equals(this.name);
            boolean isAge = a.age == this.age;
            boolean isTail = a.tail == this.tail;
            return isName && isAge && isTail;
        }
        return false;
    }

    public int hashCode(){
        int result = 17;

        result = 37 * result + (name == null? 0 : name.hashCode());
        result = 37 * result + age;
        result = 37 * result + (tail ? 1 : 0);

        return result;
    }
}
