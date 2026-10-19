package TestComplexTasks.Task1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RemoveEntityTest extends Precondition {
    //Позитивные кейсы
    //Удаление 2 Entity который есть в списке -> размер листа равен 0 , true
    //Корнер:
    //Дважды удалить одного и того же Entity -> сначала true, потом false
    //Негативные кейсы:
    //Удалить Entity из пустого листа - false
    //Удалить Entity который равен null - false
    //Удалить юзера которого нет в листе -> false

    @Test
    @DisplayName("Удаление 2 Entity который есть в списке")
    void remove_Two_Entity_Test(){
        targetClass.addEntity(e1);
        targetClass.addEntity(e2);
        assertTrue(targetClass.removeEntity(e1));
        assertTrue(targetClass.removeEntity(e2));
        assertEquals(0,targetClass.getAllEntities().size());
    }

    @Test
    @DisplayName("Дважды удалить одного и того же Entity")
    void remove_The_Same_One_Twice_Entity(){
        targetClass.addEntity(e1);
        assertTrue(targetClass.removeEntity(e1));
        assertFalse(targetClass.removeEntity(e1));
    }

    @Test
    @DisplayName("Удалить Entity из пустого листа")
    void remove_Entity_In_IsEmpty_List(){
        assertFalse(targetClass.removeEntity(e1));
    }

    @Test
    @DisplayName("Удалить Entity который равен null")
    void return_Exception_If_Remove_Null_Entity(){
        assertThrows(IllegalArgumentException.class, ()-> targetClass.removeEntity(null));
    }

    @Test
    @DisplayName("Удалить юзера которого нет в листе ")
    void remove_Entity_Which_Is_Not_On_The_List(){
        targetClass.addEntity(e1);
        assertFalse(targetClass.removeEntity(e2));
    }
}
