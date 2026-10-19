package ComplexTasks.Task2;

public class UserValidator {
    private boolean validation;
    private final String userNameRegex = "^[A-ZА-ЯЁ][a-zA-Zа-яёЁ]*$";
    private final String userEmailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";

    public boolean toogleValidation() {
        return this.validation = !this.validation;
    }

    public boolean getValidation() {
        return this.validation;
    }

    public boolean checkName(User user) {
        if (validation) {
            if (user.getName() == null) {
                throw new IllegalArgumentException("Имя не может быть null");
            }
            if (!user.getName().isEmpty() && user.getName().matches(userNameRegex)) {
                return true;
            }
            throw new InvalidUserException("Имя не валидно");
        }
        return false;
    }

    public boolean checkAge(User user) {
        if (validation) {
            if (user.getAge() >= 18 && user.getAge() <= 100) {
                return true;
            }
            throw new InvalidUserException("Возраст не валиден");
        }
        return false;
    }

    public boolean checkEmail(User user) {
        if (validation) {
            if (user.getEmail() == null) {
                throw new IllegalArgumentException("Email не может быть null");
            }
            if (!user.getEmail().isEmpty() && user.getEmail().matches(userEmailRegex)) {
                return true;
            }
            throw new InvalidUserException("Email не валиден");
        }
        return false;
    }


}
