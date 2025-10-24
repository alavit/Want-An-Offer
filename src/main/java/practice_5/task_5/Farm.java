package practice_5.task_5;

public class Farm {
    private DomesticAnimal animal;

    void addAnimal(DomesticAnimal animal) {
        this.animal = animal;
    }

    void showProduction(DomesticAnimal animal) {
        animal.produce();
    }

    void showNeedsCare(DomesticAnimal animal) {
        animal.needsCare();
    }
}
