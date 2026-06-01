package testcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.NoSuchElementException;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FindMaxTest extends Preconditions{

    /*
    Позитивные кейсы
    Массив с положительными числами
    Массив с отрицательными числами

    Коренер:
    Один элемент в массиве

    Негативный кейс:
    Пустой массив (должно выбрасываться исключение)
     */

    static Stream<Arguments> arraysPositiveCase(){
        return Stream.of(
                Arguments.of(new int[]{1,2,6,99,80},99),
                Arguments.of(new int[]{-3,-6,-99,-1},-1)
        );
    }

    static Stream<Arguments> arraysCornerCase(){
        return Stream.of(
                Arguments.of(new int[]{5},5),
                Arguments.of(new int[]{-100},-100),
                Arguments.of(new int[]{0},0)
        );
    }

    @DisplayName("Тест на массивы с положительными и отрицательными числами")
    @ParameterizedTest
    @MethodSource("arraysPositiveCase")
    void returnMaxNumber_isPossitiveCasesArray(int[] numbers, int number){
        assertEquals(number,homeWork.findMax(numbers));
    }


    @DisplayName("Тест на одно число в массиве")
    @ParameterizedTest
    @MethodSource("arraysCornerCase")
    void returnMaxNumber_isCornerCasesArray(int[]numbers,int number){
        assertEquals(number,homeWork.findMax(numbers));
    }

    @DisplayName("Тест на пустой массив")
    @Test
    void returnException_isNegativeCaseArray(){
        assertThrows(NoSuchElementException.class,()->homeWork.findMax(new int[]{}));
    }
}
