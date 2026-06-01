package testcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;


import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class ReverseStringTest extends Preconditions{

    /*

    Позитивный кейс:
    Обычные строки

    Корнер кейс:
    Пустую строку
    Строку с несколькими пробелами

    Негативный кейс:
    null (должно возвращаться null)
     */

    static Stream<Arguments> baseStrings(){
        return Stream.of(
                Arguments.of("hello","olleh"),
                Arguments.of("A","A"),
                Arguments.of("Danila privet","tevirp alinaD")
        );
    }

    @DisplayName("Тест на обычную строку")
    @ParameterizedTest
    @MethodSource("baseStrings")
    void reversePositiveCase_ReturnCorrectReverseString(String base, String actual){
        assertEquals(base,homeWork.reverse(actual));
    }

    @DisplayName("Тест на пустую строку и строку с пробелами")
    @ParameterizedTest
    @ValueSource(strings = {"","  "})
    void reverseEmptyString_ReturnEmptyString(String string){
        assertEquals(string,homeWork.reverse(string));
    }

    @DisplayName("Тест на null")
    @Test
    void reverseStringIsNull_ReturnNull(){
        assertNull(homeWork.reverse(null));
    }
}
