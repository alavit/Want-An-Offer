package main.java.practice_5.task_1;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        Animal elephant = new Elephant();
        Animal bird = new Bird();

        zoo.setAnimal(bird);
        zoo.showMakingSound(bird);
        zoo.showMovement(bird);
    }
}
