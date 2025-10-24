package practice_6.hash_map;

import java.util.HashMap;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> people  = new HashMap<>();
        people.put("Alice", 30);
        people.put("Bob", 25);
        people.put("Charlie", 35);
        people.put("David", 40);
        people.put("Emil", 50);
        System.out.print("Enter a name: ");
        String name = scanner.nextLine();
        if (people.containsKey(name)) {
            System.out.println(name+" is in the HashMap");
        }
    }
}
