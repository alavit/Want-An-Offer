package practice_6.tree_map;

import java.util.TreeMap;

public class Task2 {
    public static void main(String[] args) {
        TreeMap<Integer,String> map = new TreeMap<>();
        map.put(41, "sdgsdg");
        map.put(12, "dsggöhkghk");
        map.put(89, "yxc");
        map.put(3, "qwerty");
        map.put(93, "qwerty");
        System.out.println("Min key: " + map.firstKey());
        System.out.println("Max key: " + map.lastKey());
    }
}
