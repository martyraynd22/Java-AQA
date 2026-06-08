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


public class CountVowelsTest extends Preconditions{
    /*
    Положительные кейсы:
    Разные строки ("hello", "java", "AEIOU")


    Негативные кейсы:
    Строка без гласных
    Пустая строка
    Строка пробелов

    Корнер:
    null (должно выбрасываться исключение)
     */

    static Stream<Arguments> positiveCase(){
        return Stream.of(
                Arguments.of("hello",2),
                Arguments.of("java",2),
                Arguments.of("AEIOU",5)
        );
    }

    @DisplayName("Тест на разные строки")
    @ParameterizedTest
    @MethodSource("positiveCase")
    void returnCount_PositiveStringCase(String string,int count){
        assertEquals(count,homeWork.countVowels(string));
    }

    @DisplayName("Тест на пустую стироку, строку пробелов и строку без гласных")
    @ParameterizedTest
    @ValueSource(strings = {"fghpKMV","","  "})
    void returnFalse_Negative_StringCase(String string){
        assertEquals(0,homeWork.countVowels(string));
    }

    @DisplayName("Тест на null")
    @Test
    void returnException_StringIsNull(){
        assertThrows(IllegalArgumentException.class,()->homeWork.countVowels(null));
    }
}
