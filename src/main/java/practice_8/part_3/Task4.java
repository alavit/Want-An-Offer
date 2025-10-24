package practice_8.part_3;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Task4 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Азбука", "Балалайка", "Ворон", "Букварь", "Медведь");
        Optional<String> matchOpt = strings.stream()
                .filter(str -> str.startsWith("Б"))
                .findFirst();

        if (matchOpt.isPresent()) {
            System.out.println("Match: " + matchOpt.get());
        } else {
            System.out.println("No match");
        }
    }
}
