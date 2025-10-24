package practice_6.hash_map;

import java.util.HashMap;

public class Task1 {
    public static void main(String[] args) {
        HashMap<String, Integer> people  = new HashMap<>();
        people.put("Alice", 30);
        people.put("Bob", 25);
        people.put("Charlie", 35);
        people.put("David", 40);
        people.put("Emil", 50);
        System.out.println(people);
    }
}
