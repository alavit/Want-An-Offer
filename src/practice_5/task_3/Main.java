package practice_5.task_3;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        Dish limonade = new Beverage("Limonade", 0.5);
        Dish soup = new HotDish("Soup", 50);

        menu.addDish(limonade);
        menu.addDish(soup);
        menu.print();
    }
}
