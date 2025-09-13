package main.java.practice_5.task_2;

public class Main {
    public static void main(String[] args) {
        PetManager petManager = new PetManager();
        Pet dog = new Dog();
        Pet cat = new Cat();

        petManager.setPet(dog);
        petManager.showEating(dog);
        petManager.showActing(dog);
    }
}
