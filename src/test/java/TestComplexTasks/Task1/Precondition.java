package TestComplexTasks.Task1;

import ComplexTasks.Task1.Entity;
import ComplexTasks.Task1.EntityManager;
import org.junit.jupiter.api.BeforeEach;

public class Precondition {
    protected EntityManager<Entity> targetClass;

    protected Entity e1;
    protected Entity e2;
    protected Entity e3;


    @BeforeEach
    public void getPrecontidions() {
        this.targetClass = new EntityManager<>();
        this.e1 = new Entity(15, "Данила", true);
        this.e2 = new Entity(20, "София", false);
        this.e3 = new Entity(25, "Саша", true);
    }

}
