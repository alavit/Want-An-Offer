package main.java.practice_5.task_2;

public class Cat extends Pet {
    @Override
    void eat() {
        System.out.println("Cat eats wet food");
    }

    @Override
    void act() {
        System.out.println("Dog plays");
    }
}
