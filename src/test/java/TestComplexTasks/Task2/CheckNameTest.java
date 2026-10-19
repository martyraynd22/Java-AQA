package TestComplexTasks.Task2;

import ComplexTasks.Task2.InvalidUserException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CheckNameTest extends Precondition {
    //Позитивные кейсы:
    //Если валидация выключена -> false
    //Если валидация включена + валидные значения -> true
    //Негативные кейсы:
    //Если валидация включена + невалидные данные -> InvalidUserException
    //Если имя null -> IllegalArgumentException

    @Test
    @DisplayName("Если валидация выключена")
    void check_If_validation_Is_Disabled(){
        assertFalse(targetClass.checkName(u2));
    }

    @Test
    @DisplayName("Если валидация включена + валидные значения")
    void check_If_validation_Is_Included_And_Valid_Values(){
        targetClass.toogleValidation();
        assertTrue(targetClass.getValidation());
        assertTrue(targetClass.checkName(u2));

    }

    @Test
    @DisplayName("Если валидация включена + невалидные данные ")
    void check_If_validation_Is_Included_And_Invalid_Values_Exception(){
        targetClass.toogleValidation();
        assertThrows(InvalidUserException.class,()-> targetClass.checkName(u4));
    }

    @Test
    @DisplayName("Если имя null ")
    void check_If_Email_Is_Null(){
        targetClass.toogleValidation();
        assertThrows(IllegalArgumentException.class,()-> targetClass.checkName(u1));
    }
}
