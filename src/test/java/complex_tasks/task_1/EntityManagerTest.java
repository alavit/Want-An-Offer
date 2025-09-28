package complex_tasks.task_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class EntityManagerTest {

    // Test case: add 1 element to empty manager
    @Test
    void canAddUserToEmptyManager() {
        EntityManager<User> manager = new EntityManager<>();
        User expectedUser = new User("Mike", 25, true);
        int initialSize = manager.getAll().size();

        manager.add(expectedUser);

        assertTrue(manager.getAll().contains(expectedUser));
        User actualUser = manager.getAll().getFirst();
        assertEquals(expectedUser, actualUser);

        assertEquals(expectedUser.getName(), actualUser.getName());
        assertEquals(expectedUser.getAge(), actualUser.getAge());
        assertEquals(expectedUser.isActive(), actualUser.isActive());

        assertEquals(initialSize + 1, manager.getAll().size());
    }
}
