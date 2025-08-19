package practice_5.task_3;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<Dish> dishes =  new ArrayList<>();

    void addDish(Dish dish) {
        this.dishes.add(dish);
    }

    void print() {
        for (Dish dish : this.dishes) {
            System.out.println(dish.getDescription());
        }
    }
}
