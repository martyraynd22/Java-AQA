package testcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class isValidEmailTest extends Preconditions{

    /*
    Позитивыне кейсы:
    Корректные и некорректные email ("test@example.com", "bad@.com", "no-at-symbol")

    Корнер кейсы:
    Пустая строка
    Строк пробелов

    Негативные кейсы:
    null
     */

    @DisplayName("Тест на корректные email")
    @ParameterizedTest
    @ValueSource(strings = {"danijlo222@mail.ru","qwerTy@t.com","111AA.2@gmail.com"})
    void returnTrue_isValidEmailCase(String email){
        assertTrue(homeWork.isValidEmail(email));
    }

    @DisplayName("Тест на некорректные email")
    @ParameterizedTest
    @ValueSource(strings = {"///a.gmail","//&***1@ru","Acom"})
    void returnFalse_isNotValidEmailCase(String email){
        assertFalse(homeWork.isValidEmail(email));
    }

    @DisplayName("Тест на пустую строку и строку из пробелов")
    @ParameterizedTest
    @ValueSource(strings = {"","   "})
    void returnFalse_EmailIsEmptyOrSpaceCase(String email){
        assertFalse(homeWork.isValidEmail(email));
    }

    @DisplayName("Тест на null")
    @Test
    void returnFalse_EmailIsNull(){
        assertFalse(homeWork.isValidEmail(null));
    }
}
