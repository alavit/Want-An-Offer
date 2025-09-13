package main.java.practice_5.task_5;

public class Cow extends DomesticAnimal{
    @Override
    void produce() {
        System.out.println("Cow gives milk");
    }

    @Override
    void needsCare() {
        System.out.println("Cow needs grazing");
    }
}
