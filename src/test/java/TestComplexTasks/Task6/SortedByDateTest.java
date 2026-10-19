package TestComplexTasks.Task6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SortedByDateTest extends Precondition {


    //Позитивные кейсы:
    //Есть задачи >= 2 -> Отсортированный лист по задачам
    //
    //Корнер кейсы :
    //Нет задач -> Пустой лист


    @Test
    void sortTaskByDate_ReturnsCorrectlySortedListByDate_WhenWeHaveTasks() {
        targetClass.addTask(x3);
        assertEquals(x3, targetClass.sortedByDate().getFirst());
        assertEquals(x3, targetClass.sortedByDate().getLast());

        targetClass.addTask(x6);
        assertEquals(x6, targetClass.sortedByDate().getFirst());
        assertEquals(x3, targetClass.sortedByDate().getLast());

        targetClass.addTask(x1);
        targetClass.addTask(x4);
        assertEquals(x4, targetClass.sortedByDate().getFirst());
        assertEquals(x1, targetClass.sortedByDate().getLast());
    }

    @Test
    void sortTaskByDate_ReturnsEmptyList_WhenWeHaveNotTask() {
        assertTrue(targetClass.sortedByDate().isEmpty());
    }
}
