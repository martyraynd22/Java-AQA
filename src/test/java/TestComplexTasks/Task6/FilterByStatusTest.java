package TestComplexTasks.Task6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FilterByStatusTest extends Precondition{

    //Позитивные кейсы
    //Если только открытые (1) -> Map.size(1), List.size(1)
    //Если только закрытые (2) -> Map.size(1), List.size(2)
    //Если открытые (1) и закрытые (3) -> Map.size(2), открытые.size(1) и закрытые.size(3)
    //
    //Корнер кейсы:
    //Пустая мапа -> Map.size(0)

    @Test
    void filterTasksByStatus_WhenListContainsOnlyOpenTasks() {
        targetClass.addTask(x1);

        assertEquals(1, targetClass.filterByStatus().size());
        assertEquals(1, targetClass.filterByStatus().get("Открытые").size());
    }

    @Test
    void filterTasksByStatus_WhenListContainsOnlyClosedTasks() {
        targetClass.addTask(x2);
        targetClass.addTask(x3);

        x2.closeTask();
        x3.closeTask();

        assertEquals(1, targetClass.filterByStatus().size());
        assertEquals(2, targetClass.filterByStatus().get("Закрытые").size());
    }

    @Test
    void filterTasksByStatus_WhenListContainsOtherTasks() {
        targetClass.addTask(x1);
        targetClass.addTask(x2);
        targetClass.addTask(x3);
        targetClass.addTask(x4);

        x2.closeTask();
        x3.closeTask();
        x4.closeTask();

        assertEquals(2, targetClass.filterByStatus().size());
        assertEquals(1, targetClass.filterByStatus().get("Открытые").size());
        assertEquals(3, targetClass.filterByStatus().get("Закрытые").size());
    }

    @Test
    void filterTasksByStatus_WhenListNpContainsTasks() {
        assertEquals(0, targetClass.filterByStatus().size());
    }
}
