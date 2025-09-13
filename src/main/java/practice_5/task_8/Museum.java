package main.java.practice_5.task_8;

public class Museum {
    private Exhibit exhibit;

    void addExhibit(Exhibit exhibit) {
        this.exhibit = exhibit;
    }

    void showDescription(Exhibit exhibit) {
        System.out.println(exhibit.describe());
    }

    void showPreservation(Exhibit exhibit) {
        System.out.println(exhibit.preserve());
    }
}
