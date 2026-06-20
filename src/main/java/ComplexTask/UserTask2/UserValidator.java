package ComplexTask.UserTask2;

public class UserValidator {
    private boolean validationEnabled = true;
    private static String regexForName = "^[A-ZА-ЯЁ][a-zA-Zа-яёЁ]*$";
    private static String regexForEmail = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";


    //Метод для валидации : Имя должно быть не пустым и начинаться с заглавной буквы.

    public boolean isValidationName(User user) throws InvalidUserException {
        if(validationEnabled) {
            if (user.name()!= null && !user.name().isEmpty() && user.name().matches(regexForName)) {
                return true;
            }
            throw new InvalidUserException("Имя является не валидным");
        }
        return false;
    }

    public boolean isValidationAge(User user) throws InvalidUserException {
        if(validationEnabled) {
            if (user.age() >= 18 && user.age() <= 100) {
                return true;
            }
            throw new InvalidUserException("Возраст является не валидным");
        }
        return false;
    }

    public boolean isValidationEmail(User user) throws InvalidUserException {
        if(validationEnabled) {
            if (!user.email().matches(regexForEmail)) {
                return true;
            }
            throw new InvalidUserException("Email является не валидным");
        }
        return false;
    }





    //Метод для переключения флага

    public void switchStatusToggle(){
        validationEnabled = !validationEnabled;
    }

    //Метод получения статуса флага

    public boolean isToggle(){
        return validationEnabled;
    }
}
