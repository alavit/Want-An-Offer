package complex_tasks.task_4;

import org.junit.jupiter.api.BeforeEach;

public class BaseTest {
    protected MovieService service;

    @BeforeEach
    void setUpTest() {
        service = new MovieService();
    }
}
