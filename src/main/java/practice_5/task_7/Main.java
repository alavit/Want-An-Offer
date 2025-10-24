package practice_5.task_7;

public class Main {
    public static void main(String[] args) {
        AdventurePark adventurePark = new AdventurePark();
        Attraction rollerCoaster = new RollerCoaster();
        Attraction carousel = new Carousel();

        adventurePark.addAttraction(carousel);
        adventurePark.showInfo(carousel);
        adventurePark.showMaintenance(carousel);
    }
}
