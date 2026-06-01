package testcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class IsValidPhoneNumberTest extends Preconditions {

    /*
    Позитивные кейсы:

    Корректные номера ("+1 1234567890")
    Некорректные номера ("12345", "invalid")

    Корнер кейсы:
    Пустотую строку или строку с пробелами

    Негативные кейсы:
    null
     */

    @DisplayName("Тест на корректные номера")
    @ParameterizedTest
    @ValueSource(strings = {"+7 9062829001", "+123 4564567890"})
    void returnTrue_IsValidProneNumber(String number) {
        assertTrue(homeWork.isValidPhoneNumber(number));
    }

    @DisplayName("Тест на некорректные номера")
    @ParameterizedTest
    @ValueSource(strings = {"+888 124824", "1829", "+1 00575757575"})
    void returnFalse_IsNotValidNumber(String number) {
        assertFalse(homeWork.isValidPhoneNumber(number));
    }

    @DisplayName("Тест на null")
    @Test
    void returnThrow_PhoneNumberIsNull() {
        assertThrows(NullPointerException.class, () -> homeWork.isValidPhoneNumber(null));
    }

    @DisplayName("Тест на пустую строку или строку с пробелами")
    @ParameterizedTest
    @ValueSource(strings = {"", "           "})
    void returnFalse_PhoneNumberIsEmptyOrSpace(String number) {
        assertFalse(homeWork.isValidPhoneNumber(number));
    }
}


