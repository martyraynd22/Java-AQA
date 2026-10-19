package ComplexTasks.Task2;

public class Main {
    public static void main(String[] args) {
        User u1 = new User("Данила", 20, "danilkaqa@gmail.com");
        User u2 = new User("София", 22, "sofia22@mail.ru");
        User u3 = new User("Никита", 87, "nikita87@yandex.ru");

        UserValidator userValidator = new UserValidator();
        userValidator.toogleValidation();
        System.out.println(userValidator.checkAge(u1));
        System.out.println(userValidator.checkEmail(u2));
        System.out.println(userValidator.checkName(u3));
    }
}
