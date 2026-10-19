package TestComplexTasks.Task1;

import ComplexTasks.Task1.Entity;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FilterByNameTest extends Precondition {

    //Позитивные кейсы:
    //Добавить 2 Entity и отфильтровать по 1 из имен-> получим список равный 1 по размеру
    //Корнер кейсы:
    //Добавить 3 Entity с разными регистрами в имени для проверки equalsIgnoreCase -> получим список равный 3 по размеру
    //Негативные кейсы:
    //Фильтр по имени в пустом листе -> NoSuchElementException
    //Фильтр по имени которое равно null -> IllegalArgumentException

    @Test
    @DisplayName("Добавить 2 Entity и отфильтровать по 1 из имен")
    void Adding_Two_Entities_And_Filtering_By_One_Of_The_Names(){
        targetClass.addEntity(e1);
        targetClass.addEntity(e2);
        assertEquals(1,targetClass.filterByName("Данила").size());
    }

    @Test
    @DisplayName("Добавить 3 Entity с разными регистрами в имени для проверки equalsIgnoreCase")
    void Add_Three_Entities_With_Different_Case_Names_To_Check_EqualsIgnoreCase(){
        targetClass.addEntity(e1);
        targetClass.addEntity(new Entity(15,"ДАНИЛА",true));
        targetClass.addEntity(new Entity(15,"дАНиЛА",true));
    assertEquals(3,targetClass.filterByName("Данила").size());
    }

    @Test
    @DisplayName("Фильтр по имени в пустом листе")
    void filter_By_Name_In_A_Blank_Sheet(){
        assertTrue(targetClass.filterByName("Имя").isEmpty());
    }

    @Test
    @DisplayName("Фильтр по имени которое равно null")
    void Filter_By_Name_That_Is_Null(){
        assertThrows(IllegalArgumentException.class,()->targetClass.filterByName(null));
    }


}
