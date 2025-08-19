package practice_5.task_2;

public class Dog extends Pet {
    @Override
    void eat() {
        System.out.println("Dog eats dry food");
    }

    @Override
    void act() {
        System.out.println("Dog walks");
    }
}
