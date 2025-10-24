package practice_6.tree_set;

import java.util.Scanner;
import java.util.TreeSet;

public class Task3 {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(10);
        set.add(22);
        set.add(3);
        set.add(17);
        set.add(45);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        Integer higher = set.higher(number);
        Integer lower = set.lower(number);

        if ( higher != null && lower != null) {
            System.out.println("Higher: " + higher);
            System.out.println("Lower: " + lower);
        }
    }
}
