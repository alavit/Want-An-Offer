package practice_10;

import org.junit.jupiter.api.BeforeEach;

public class Task10ParentTest {
    protected Task10 phoneNumberValidator;

    @BeforeEach
    void setUpTest() {
        phoneNumberValidator = new Task10();
    }
}
