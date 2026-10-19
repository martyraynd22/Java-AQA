package TestComplexTasks.Task6;

import ComplexTasks.Task6.Priority;
import ComplexTasks.Task6.Task;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AddTaskTest extends Precondition{
    //Позитивные кейсы :
    //id 1 -> Добавлена, размер 1
    //id 2 -> Добавлена, размер 2
    //id 2 -> Не добавлена, размер 2
    //Негативные кейсы :
    //id null -> IllegalArgumentException

    @Test
    void addTaskToList_CanAddTaskWithUniqueId() {
        assertEquals(0, targetClass.getTaskList().size());

        targetClass.addTask(x1);
        assertEquals(1, targetClass.getTaskList().size());

        targetClass.addTask(x2);
        assertEquals(2, targetClass.getTaskList().size());

        targetClass.addTask(x3);
        targetClass.addTask(x6);
        assertEquals(4, targetClass.getTaskList().size());
    }

    @Test
    void addTaskToList_CantAddEqualIdTask() {
        targetClass.addTask(x1);
        targetClass.addTask(x1);
        assertEquals(1, targetClass.getTaskList().size());
    }

    @Test
    void addTaskToList_ReturnsException_WhenTaskIdIsNull() {
        assertThrows(IllegalArgumentException.class, () -> targetClass.addTask(new Task<>(null, Priority.LOW,LocalDate.of(2026, 4, 15))));
    }
}
