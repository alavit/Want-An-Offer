package complex_tasks.task_2;

public class UserValidator {
    public boolean isNameValid(User user) {
        return user.getName() != null
                && !user.getName().isEmpty()
                && Character.isUpperCase(user.getName().codePointAt(0));
    }

    public boolean isAgeValid(User user) {
        return user.getAge() >= 18 && user.getAge() <= 1000;
    }

    public boolean isEmailValid(User user) {
        return user.getEmail() != null
                && user.getEmail().matches("^[\\w.-]+@[\\w.-]+\\.\\w{2,}$");
    }
}
