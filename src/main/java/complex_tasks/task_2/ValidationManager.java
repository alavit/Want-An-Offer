package complex_tasks.task_2;

public class ValidationManager {
    private boolean validationEnabled;
    private final UserValidator userValidator;

    {
        validationEnabled = false;
    }

    public ValidationManager(boolean validationEnabled, UserValidator userValidator) {
        this.validationEnabled = validationEnabled;
        this.userValidator = userValidator;
    }

    public void validate(User user) throws InvalidUserException {
        if (this.validationEnabled) {
            if (!userValidator.isNameValid(user)
                    || !userValidator.isAgeValid(user)
                    || !userValidator.isEmailValid(user)) {
                throw new InvalidUserException("User has invalid data");
            }
        }
    }
}
