package practice_5.task_7;

public class AdventurePark {
    private Attraction attraction;

    void addAttraction(Attraction attraction) {
        this.attraction = attraction;
    }

    void showInfo(Attraction attraction) {
        System.out.println(attraction.info());
    }

    void showMaintenance(Attraction attraction) {
        System.out.println(attraction.maintain());
    }
}
