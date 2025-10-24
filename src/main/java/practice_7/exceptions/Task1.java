package practice_7.exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Task1 {
    public static void main(String[] args) {
        String line;
        try (BufferedReader reader = new BufferedReader(new FileReader("src/main.java.practice_7/exceptions/data.txt"))) {
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("File not found: " + e.getMessage());
        }
    }
}
