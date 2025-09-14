package practice_10;

import org.junit.jupiter.api.BeforeEach;

public class Task7ParentTest {
    protected Task7 factorialCalculator;

    @BeforeEach
    void setUpTest() {
        factorialCalculator = new Task7();
    }
}
