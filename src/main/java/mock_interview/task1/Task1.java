package mock_interview.task1;

/*  write method(List<String>, int length) which finds how many strings does list with length have
    Solution: Stream -> filter()
 */

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    List<String> list;

    public Task1(List<String> list) {
        this.list = list;
    }

    static long countStringsWithLength(List<String> list, int length) {
        return list
                .stream()
                .filter(s -> s.length() == length)
                .count();
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("abc");
        list.add("foobar");
        list.add("bird");

        System.out.println(countStringsWithLength(list, 4)); // 1
    }
}
