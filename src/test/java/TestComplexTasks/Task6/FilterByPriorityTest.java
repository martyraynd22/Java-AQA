package TestComplexTasks.Task6;

import ComplexTasks.Task6.Priority;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class FilterByPriorityTest extends Precondition{
    /**
     * Positive :
     * LOW -> 2
     * HIGH -> 2
     * MEDIUM -> 1
     * BLOCKER -> 1
     *
     * Когда нет задач в таком приоритете -> Пусто
     *
     * Negative :
     * null -> Illegal
     */

    @Test
    void filterTaskListByPriority_ReturnsCorrectlyTasksList_WhenWeHaveThisTasks() {
        targetClass.addTask(x1);
        targetClass.addTask(x2);
        targetClass.addTask(x3);
        targetClass.addTask(x4);
        targetClass.addTask(x5);
        targetClass.addTask(x6);

        assertEquals(2, targetClass.filterByPriority(Priority.LOW).size());
        assertEquals(2, targetClass.filterByPriority(Priority.HIGH).size());
        assertEquals(1, targetClass.filterByPriority(Priority.MEDIUM).size());
        assertEquals(1, targetClass.filterByPriority(Priority.BLOCKED).size());

        assertEquals(x6, targetClass.filterByPriority(Priority.BLOCKED));
    }

    @Test
    void filterTaskListByPriority_ReturnsEmptyList_WhenWeHaveNotTask() {
        assertTrue(targetClass.filterByPriority(Priority.BLOCKED).isEmpty());
    }

    @Test
    void filterTaskListByPriority_ReturnsException_InputIsNull() {
        assertThrows(IllegalArgumentException.class, () -> targetClass.filterByPriority(null));
    }
}

