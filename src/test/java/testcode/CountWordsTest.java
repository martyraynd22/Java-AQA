package testcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CountWordsTest extends Preconditions{

    /*
    Позитивыные кейсы:
    Строка с 1 словом
    Строка с несколькими словами

    Негативные кейсы:
    null

    Корнер кейсы:
    Тест на пустую строку и строку с пробелами
     */

    static Stream<Arguments> positiveCase(){
        return Stream.of(
                Arguments.of("Информационный",1),
                Arguments.of("Привет мир",2)
        );
    }

    @DisplayName("Тест на строку с 1 и несколькими словами")
    @ParameterizedTest
    @MethodSource("positiveCase")
    void returnCountWords_isValidString(String actual, int expected){
        assertEquals(expected,homeWork.countWords(actual));
    }

    @DisplayName("Тест на null")
    @Test
    void returnNull_WhenStringIsNull(){
        assertThrows(NullPointerException.class, () ->homeWork.countWords(null));
    }

    @DisplayName("Тест на пустую строку и строку с пробелами")
    @ParameterizedTest
    @ValueSource(strings = {"","  "})
    void returnZero_WhenStringIsSpaceOrEmpty(String actual){
        assertEquals(0,homeWork.countWords(actual));
    }
}
