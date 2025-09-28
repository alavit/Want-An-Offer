package complex_tasks.task_6;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskServiceTest extends BaseTest {
    /*Test cases:
    Positive:
        - add task with unique id -> task is added
        - remove task by id
        - filter by status
        - filter by priority
        - sortByDate

    Negative:
        - add task with existing id -> task is not added
    */

    @Test
    void userCanAddTaskWithUniqueId() {
        service.addTask(TASK_CREATED);

        assertEquals(1, service.getTasks().size());
        assertEquals(TASK_CREATED, service.getTasks().get(0));
    }

    @Test
    void userCannotAddTaskWithExistingId() {
        service.addTask(TASK_CREATED);

        service.addTask(TASK_CREATED);

        assertEquals(1, service.getTasks().size());
    }

    @Test
    void userCanRemoveTaskById() {
        service.addTask(TASK_CREATED);

        service.removeTask(1);

        assertEquals(0, service.getTasks().size());
    }

    @Test
    void userCanFilterTasksByStatus() {
        service.addTask(TASK_DONE);
        service.addTask(TASK_CREATED);

        List<Task> tasksFiltered = service.filterByStatus("done");

        assertEquals(1, tasksFiltered.size());
        assertEquals("done", tasksFiltered.get(0).getStatus());
    }

    @Test
    void userCanFilterTasksByPriority() {
        service.addTask(TASK_DONE);
        service.addTask(TASK_CREATED);

        List<Task> tasksFiltered = service.filterByPriority("low");

        assertEquals(1, tasksFiltered.size());
        assertEquals("low", tasksFiltered.get(0).getPriority());
    }

    @Test
    void userCanSortTasksByDate() {
        service.addTask(TASK_CREATED);
        service.addTask(TASK_YESTERDAY);

        List<Task> tasksSorted = service.sortByDate();

        assertEquals(2, tasksSorted.size());
        assertEquals(yesterday, tasksSorted.get(0).getDate());
        assertEquals(today, tasksSorted.get(1).getDate());
    }
}
