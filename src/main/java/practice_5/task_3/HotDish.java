package practice_5.task_3;

public class HotDish extends Dish {
    private int temperature;

    HotDish(String description, int temperature) {
        super(description);
        this.temperature = temperature;
    }

    @Override
    String getDescription() {
        return "Description: " + this.description + ", Temperature: " + this.temperature;
    }
}
