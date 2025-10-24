package practice_5.task_1;

public class Elephant extends Animal {
    @Override
    void makeSound() {
        System.out.println("Elephant trumpets");
    }

    @Override
    void move() {
        System.out.println("Elephant walks");
    }
}
