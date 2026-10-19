package TestComplexTasks.Task1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FilterByActiveTest extends Precondition {
    //Позитивные кейсы:
    //Добавить элементы с true -> фильтровать по true -> размер списка будет 2
    //Негативные кейсы:
    //Фильтр по пустому списку -> размер списка будет 0 -> вернет false

    @Test
    @DisplayName("Добавить все элементы и фильтровать по true")
    void filter_Entity_By_IsActive_True(){
        targetClass.addEntity(e1);
        targetClass.addEntity(e2);
        targetClass.addEntity(e3);
        assertEquals(2,targetClass.filterByActive(true).size());
    }

    @Test
    @DisplayName("Фильтр по пустому списку")
    void filter_Entity_By_List_Is_Empty(){
        assertTrue(targetClass.filterByActive(false).isEmpty());
    }


}
