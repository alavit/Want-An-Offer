package practice_10;

import org.junit.jupiter.api.BeforeEach;

public class Task6ParentTest {
    protected Task6 emailValidator;

    @BeforeEach
    void setUpTest() {
        emailValidator = new Task6();
    }
}
