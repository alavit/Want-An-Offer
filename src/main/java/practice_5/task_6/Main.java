package practice_5.task_6;

public class Main {
    public static void main(String[] args) {
        BotanicalGarten garten = new BotanicalGarten();
        Plant orchid = new Orchid();
        Plant cactus = new Cactus();

        garten.addPlant(cactus);
        garten.showNeedsCare(cactus);
    }
}
