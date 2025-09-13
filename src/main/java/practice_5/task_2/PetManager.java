package main.java.practice_5.task_2;

public class PetManager {
    private Pet pet;

    void setPet(Pet pet) {
        this.pet = pet;
    }

    void showEating(Pet pet) {
        pet.eat();
    }

    void showActing(Pet pet) {
        pet.act();
    }
}
