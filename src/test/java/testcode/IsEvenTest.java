package testcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class IsEvenTest extends Preconditions{
    /*
    Положительные кейсы:
    Четные положительные числа
    Четные отрицательные числа
    Не четные числа

    Корнер:
    Число 0
     */

    @DisplayName("Четные положительные и отрицательные числа")
    @ParameterizedTest
    @ValueSource(ints = {2,-20})
    void isEvenValue_ReturnsTrue_WhenValueIsEven(int value){
        assertTrue(homeWork.isEven(value));
    }

    @DisplayName("Тест на не четные числа")
    @ParameterizedTest
    @ValueSource(ints = {-3,5})
    void isEvenValue_ReturnFalse_WhenValueIsNotEven(int value){
        assertFalse(homeWork.isEven(value));
    }

    @DisplayName("Тест на 0")
    @Test
    void isEvenValue_ReturnTrue_WhenValueIsZero(){
        assertTrue(homeWork.isEven(0));
    }


}
