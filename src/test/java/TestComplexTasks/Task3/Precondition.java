package TestComplexTasks.Task3;

import ComplexTasks.Task2.UserValidator;
import ComplexTasks.Task3.GradeService;
import org.junit.jupiter.api.BeforeEach;

public class Precondition {
    protected GradeService<Double> targetClass;

    @BeforeEach
    public void getPrecontidions() {
        this.targetClass = new GradeService<>();
    }
}
