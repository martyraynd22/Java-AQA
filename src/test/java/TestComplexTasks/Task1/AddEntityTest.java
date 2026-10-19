package TestComplexTasks.Task1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AddEntityTest extends Precondition {

    // Позитивные кейсы:
    // Добавление 2 валидных Еntity через потоки -> размер списка равен  2
    //Корнер кейс:
    //Добавление дважды одного и того же юзера -> размер списка равен 1
    // Негативные кейсы:
    // Добавление Entity который равен null -> IllegalArgumentException

    @Test
    @DisplayName("Добавление 2 валидных Еntity через потоки")
    void add_Two_Entity_Test() {
        Thread t1 = new Thread(() -> targetClass.addEntity(e1));
        Thread t2 = new Thread(() -> targetClass.addEntity(e2));

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        assertEquals(2, targetClass.getAllEntities().size());
    }

    @Test
    @DisplayName("Добавление дважды одного и того же Entity")
    void add_One_Entity_Equals_Two_Entity_Test() {
        targetClass.addEntity(e2);
        targetClass.addEntity(e2);
        assertEquals(1, targetClass.getAllEntities().size());
    }

    @Test
    @DisplayName("Добавление Entity который равен null")
    void return_Exception_If_Add_Null_Entity() {
        assertThrows(IllegalArgumentException.class, () -> targetClass.addEntity(null));
    }
}
