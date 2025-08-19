package practice_5.task_1;

public class Zoo {
    private Animal animal;

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public void showMakingSound(Animal animal) {
        animal.makeSound();
    }

    public void showMovement(Animal animal) {
        animal.move();
    }
}
