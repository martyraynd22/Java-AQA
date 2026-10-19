package TestComplexTasks.Task2;

import ComplexTasks.Task2.InvalidUserException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CheckAgeTest extends Precondition{

    //Позитивные кейсы:
    //Если валидация выключена -> false
    //Если валидация включена + валидные значения -> true
    //Негативные кейсы:
    //Если валидация включена + невалидные данные -> InvalidUserException

    @Test
    @DisplayName("Если валидация выключена")
    void check_If_validation_Is_Disabled(){
        assertFalse(targetClass.checkAge(u2));
    }

    @Test
    @DisplayName("Если валидация включена + валидные значения")
    void check_If_validation_Is_Included_And_Valid_Values(){
        targetClass.toogleValidation();
        assertTrue(targetClass.getValidation());
        assertTrue(targetClass.checkAge(u2));

    }

    @Test
    @DisplayName("Если валидация включена + невалидные данные ")
    void check_If_validation_Is_Included_And_Invalid_Values_Exception(){
        targetClass.toogleValidation();
        assertThrows(InvalidUserException.class,()-> targetClass.checkAge(u1));
    }
}
