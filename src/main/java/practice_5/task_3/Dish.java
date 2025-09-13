package main.java.practice_5.task_3;

public class Dish {
    protected String description;

    Dish(String description) {
        this.description = description;
    }

    String getDescription() {
        return "Description: " + description;
    }
}
