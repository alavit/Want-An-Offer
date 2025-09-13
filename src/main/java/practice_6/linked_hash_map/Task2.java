package main.java.practice_6.linked_hash_map;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedHashMap<String, Integer> phoneBook = new LinkedHashMap<>();
        phoneBook.put("Alice", 7589456);
        phoneBook.put("Bob", 1234567);
        phoneBook.put("Charlie", 9876543);
        phoneBook.put("Diana", 4567890);
        System.out.println("Enter a name to search in the phone book: ");
        String name = scanner.nextLine();
        if (phoneBook.containsKey(name)) {
            System.out.println(name + "'s phone number: " + phoneBook.get(name));
        } else {
            System.out.println(name + "'s phone number not found.");
        }
    }
}
