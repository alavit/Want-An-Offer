package practice_5.task_7;

public class RollerCoaster extends Attraction{
    @Override
    public String info() {
        return "RollerCoaster provides adrenaline";
    }

    @Override
    public String maintain() {
        return "RollerCoaster needs regular safety check";
    }
}
