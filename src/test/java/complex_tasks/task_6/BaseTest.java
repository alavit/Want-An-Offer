package complex_tasks.task_6;

import org.junit.jupiter.api.BeforeEach;

import java.util.Date;

public class BaseTest {
    protected Date today = new Date();
    protected long oneDayMillis = 24 * 60 * 60 * 1000;
    protected Date yesterday = new Date(today.getTime() - oneDayMillis);
    protected TaskService service;
    protected Task TASK_CREATED = new Task(1, "created", "low", today);
    protected Task TASK_DONE = new Task(2, "done", "high", today);
    protected Task TASK_YESTERDAY = new Task(2, "done", "high", yesterday);

    @BeforeEach
    void setUpTest() {
        service = new TaskService();
    }
}
