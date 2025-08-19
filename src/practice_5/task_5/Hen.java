package practice_5.task_5;

public class Hen extends DomesticAnimal{
    @Override
    void produce() {
        System.out.println("Hen gives eggs");
    }

    @Override
    void needsCare() {
        System.out.println("Hen needs feed with grain");
    }
}
