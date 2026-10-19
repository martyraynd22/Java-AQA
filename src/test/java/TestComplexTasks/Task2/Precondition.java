package TestComplexTasks.Task2;


import ComplexTasks.Task2.User;
import ComplexTasks.Task2.UserValidator;
import org.junit.jupiter.api.BeforeEach;

public class Precondition {
    protected UserValidator targetClass;

    protected User u1;
    protected User u2;
    protected User u3;
    protected User u4;

    @BeforeEach
    public void getPrecontidions() {
        this.targetClass = new UserValidator();
        this.u1 = new User(null,17,"Danila@gmail.com/");
        this.u2 = new User("Андрей",20,"Andrei20@mail.ru");
        this.u3 = new User("Андрейка",20,null);
        this.u4 = new User("Андрейка1",20,"check@mail.ru");
    }
}
