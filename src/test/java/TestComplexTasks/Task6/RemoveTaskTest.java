package TestComplexTasks.Task6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RemoveTaskTest extends Precondition {

    // Позитивные кейсы:
    //Удаляем несколько имеющихся тасок (3/4) -> удалили 3 таски / 4 -> true
    //
    //Корнер кейсы:
    //Удаляем таску, Id Которой нет -> false
    //
    //Негативные кейсы:
    //null id -> IllegalArgumentException



    @Test
    void removeTaskFromList_ReturnsTrue_WhenWeDeleteContainedTask() {
        targetClass.addTask(x1);
        targetClass.addTask(x2);
        targetClass.addTask(x3);
        targetClass.addTask(x4);
        targetClass.addTask(x5);
        targetClass.addTask(x6);

        targetClass.addTask(x1);
        targetClass.addTask(x2);
        targetClass.addTask(x3);
        targetClass.addTask(x4);
        targetClass.addTask(x5);
        targetClass.addTask(x6);

        assertEquals(6, targetClass.getTaskList().size());

        Thread t1 = new Thread(() -> {
            targetClass.removeTask(1);
            targetClass.removeTask(4);
        });

        Thread t2 = new Thread(() -> {
            targetClass.removeTask(2);
            targetClass.removeTask(5);
        });

        Thread t3 = new Thread(() -> {
            targetClass.removeTask(3);
        });

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        assertEquals(1, targetClass.getTaskList().size());

        assertTrue(targetClass.removeTask(6));
        assertEquals(0, targetClass.getTaskList().size());
    }

    @Test
    void removeTaskFromList_ReturnsFalse_WhenWeDeleteNotContainedTask() {
        assertEquals(0, targetClass.getTaskList().size());
        assertFalse(targetClass.removeTask(1));
    }

    @Test
    void removeTaskFromList_ReturnsException_WhenInputIsNull() {
        assertThrows(IllegalArgumentException.class, () -> targetClass.removeTask(null));
    }
}
