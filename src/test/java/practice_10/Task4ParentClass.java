package practice_10;

import org.junit.jupiter.api.BeforeEach;

public class Task4ParentClass {
    protected Task4 maxFinder;

    @BeforeEach
    void setUpTest() {
        maxFinder = new Task4();
    }
}
