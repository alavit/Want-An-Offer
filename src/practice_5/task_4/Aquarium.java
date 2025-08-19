package practice_5.task_4;

public class Aquarium {
    private SeaCreature seaCreature;

    void addSeaCreature(SeaCreature seaCreature) {
        this.seaCreature = seaCreature;
    }

    void showSwimming(SeaCreature seaCreature) {
        seaCreature.move();
    }
}
