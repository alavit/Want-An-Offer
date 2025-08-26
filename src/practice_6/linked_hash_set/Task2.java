package practice_6.linked_hash_set;

import java.util.LinkedHashSet;

public class Task2 {
    public static void main(String[] args) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        addElements(set,1);
        addElements(set,2);
        addElements(set,3);
        addElements(set,1); // ignored
        System.out.println(set);
    }

    public static void addElements(LinkedHashSet<Integer> set, int element) {
        set.add(element);
    }
}
