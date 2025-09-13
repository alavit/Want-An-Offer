package main.java.practice_5.task_5;

public class Main {
    public static void main(String[] args) {
        Farm farm = new Farm();
        DomesticAnimal cow = new Cow();
        DomesticAnimal hen =  new Hen();

        farm.addAnimal(cow);
        farm.showProduction(cow);
        farm.showNeedsCare(cow);
    }
}
