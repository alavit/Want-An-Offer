package practice_7.generics;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Box<Integer> boxInteger = new Box<>();
        boxInteger.setItem(42);
        System.out.println("Item: " + boxInteger.getItem());

        Box<String> boxString = new Box<>();
        boxString.setItem("Hello, Generics!");
        System.out.println("Item: " + boxString.getItem());

        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(10);
        intList.add(20);
        intList.add(25);
        Print.printArray(intList);

        ArrayList<String> strList = new ArrayList<>();
        strList.add("Java");
        strList.add("Generics");
        Print.printArray(strList);

        Pair<String, Integer> pair = new Pair<>("Mike", 30);
        System.out.println("Key: " + pair.getKey() + ", Value: " + pair.getValue());

        Pair<Integer, Boolean> logicalPair = new Pair<>(1, true);
        System.out.println("Key: " + logicalPair.getKey() + ", Value: " + logicalPair.getValue());
    }
}
