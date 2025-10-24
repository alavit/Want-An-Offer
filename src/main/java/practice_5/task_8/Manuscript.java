package practice_5.task_8;

public class Manuscript extends Exhibit {
    @Override
    String describe() {
        return "Manuscript is an ancient writing on a kind of paper";
    }

    @Override
    String preserve() {
        return "Manuscript needs temperature and humidity control";
    }
}
