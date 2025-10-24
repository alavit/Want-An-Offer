package practice_5.task_6;

public class BotanicalGarten {
    private Plant plant;

    void addPlant(Plant plant) {
        this.plant = plant;
    }

    void showNeedsCare(Plant plant) {
        plant.needsCare();
    }
}
