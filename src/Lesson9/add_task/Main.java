package Lesson9.add_task;

public class Main {

    public static void main(String[] args) {

        Animal dog1 = new Animal("Tuzik", 12, true);
        Animal dog2 = new Animal("Alex", 5, false);
        Animal dog3 = new Animal("Tuzik", 12, true);

        System.out.println(dog1.equals(dog2));
        System.out.println(dog1.equals(dog3));
        System.out.println(dog2.equals(dog3));

    }

}
