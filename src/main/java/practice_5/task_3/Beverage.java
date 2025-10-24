package practice_5.task_3;

public class Beverage extends Dish{
    private double volume;

    Beverage(String description, double volume) {
        super(description);
        this.volume = volume;
    }

    @Override
    String getDescription() {
        return "Description: " + this.description + ", Volume: " + this.volume;
    }
}
