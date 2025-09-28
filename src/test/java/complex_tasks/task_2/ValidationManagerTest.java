package complex_tasks.task_2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ValidationManagerTest {

    /**
     * Test cases:
     * validationEnabled = false, name is invalid -> no InvalidUserException
     * validationEnabled = true, name is invalid -> InvalidUserException
     * validationEnabled = true, age is invalid -> InvalidUserException
     * validationEnabled = true, email is invalid -> InvalidUserException
     * validationEnabled = true, user is null -> InvalidUserException
     */

    @Test
    void validate_doesNotThrow_whenDisabled_andNameInvalid() throws InvalidUserException {
        User mike = new User("mike", 25, "mike@gmail.com");
        UserValidator userValidator = new UserValidator();
        ValidationManager manager = new ValidationManager(false, userValidator);

        assertDoesNotThrow(() -> manager.validate(mike), "validate must not throw exception when disabled");
    }

    @Test
    void validate_throws_whenEnabled_andNameInvalid() throws InvalidUserException {
        User mike = new User("mike", 25, "mike@gmail.com");
        UserValidator userValidator = new UserValidator();
        ValidationManager manager = new ValidationManager(true, userValidator);

        assertThrows(InvalidUserException.class, () -> manager.validate(mike), "Expected validate() to throw InvalidUserException for user with invalid name");
    }
}
