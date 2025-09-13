package main.java.practice_6.hash_set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> set = new HashSet<String>();
        set.add("John");
        set.add("Mark");
        set.add("David");
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        if (set.contains(name)) {
            System.out.println("Your name is in the set");
        }
    }
}
