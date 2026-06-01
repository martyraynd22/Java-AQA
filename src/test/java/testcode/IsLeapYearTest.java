package testcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IsLeapYearTest extends Preconditions{
    /*
    Положительные кейсы:
    Високосные (2020, 2000, 1600)

    Негативыне кейсы:
    Года, которые делятся на 100, но не на 400 (1900, 2100)
    Обычные года
     */

    @DisplayName("Високосные года, года которые делятся и на 100 и на 400")
    @ParameterizedTest
    @ValueSource(ints = {2024,2020,2000,1600,8})
    void returnTrue_IsLeapYearWhenLeapDivide100and400(int year){
        assertTrue(homeWork.isLeapYear(year));
    }

    @DisplayName("Тест на обычные года и года которые делятся на 100, но не на 400 ")
    @ParameterizedTest
    @ValueSource(ints = {2026,2001,2005,2010,1900,2100})
    void returnFalse_IsYearNotLeap(int year){
        assertFalse(homeWork.isLeapYear(year));
    }

}
