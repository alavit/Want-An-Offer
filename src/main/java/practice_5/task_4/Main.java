package practice_5.task_4;

public class Main {
    public static void main(String[] args) {
        Aquarium aquarium = new Aquarium();
        SeaCreature shark = new Shark();
        SeaCreature seaStar = new SeaStar();

        aquarium.addSeaCreature(seaStar);
        aquarium.showSwimming(seaStar);
    }
}
