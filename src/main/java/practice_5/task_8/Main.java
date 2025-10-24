package practice_5.task_8;

public class Main {
    public static void main(String[] args) {
        Museum museum = new Museum();
        Exhibit manuscript = new Manuscript();
        Exhibit sculpture = new Sculpture();

        museum.addExhibit(manuscript);
        museum.showDescription(manuscript);
        museum.showPreservation(manuscript);
    }
}
