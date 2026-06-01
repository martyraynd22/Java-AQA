package testcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.NoSuchElementException;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FindSecondMax extends Preconditions{

    /*

    Позитивыне кейсы:
    Массив с положительными числами
    Массив с отрицательными числами

    Негативыне кейсы:
    Массив с одинаковыми числами(должно выбрасываться исключение)
    Один элемент в массиве (должно выбрасываться исключение)
    Пустой массив(должно выбрасываться исключение)
     */

    static Stream<Arguments> positiveArrayCase(){
        return Stream.of(
                Arguments.of(new int[]{1,5,6,7,1290,100},100),
                Arguments.of(new int[]{-100,-400,-40,-2,-1},-2)
        );
    }

    @DisplayName("Тест на положительные и отрицательные числа")
    @ParameterizedTest
    @MethodSource("positiveArrayCase")
    void returnSecondMaxNumberInArrays(int[] actual, int expected){
        assertEquals(expected,homeWork.findSecondMax(actual));
    }

    @DisplayName("Тест на массив с одинаковыми числами")
    @Test
    void returnThrow_WhenSecondMaxInArrayEqualsAllNumber(){
        assertThrows(NoSuchElementException.class,()->homeWork.findSecondMax(new int[]{7,7,7,7,7,7,7}));
    }

    @DisplayName("Тест на пустой масив")
    @Test
    void returnThrow_WhenArrayIsEmpty(){
        assertThrows(IllegalArgumentException.class,()->homeWork.findSecondMax(new int[]{}));
    }

    @DisplayName("Тест на 1 элемент в мавссиве")
    @Test
    void returnThrow_WhenOnValueInArray(){
        assertThrows(IllegalArgumentException.class,()->homeWork.findSecondMax(new int[]{9}));
    }
}
