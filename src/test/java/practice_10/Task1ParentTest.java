package practice_10;

import org.junit.jupiter.api.BeforeEach;

public class Task1ParentTest {
    protected Task1 numberProcessor;

    @BeforeEach
    void setUpTest() {
        numberProcessor = new Task1();
    }
}
