package testcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FactorialTest extends Preconditions{
    /*
    Позитивыне кейсы:
    0! = 1
    Маленькие числа (1!, 5!, 7!)

   Корнер кейс:
   Выбрать факториал того числа значение которрого будет больше чем значение которое помещается в int(выбросит исключение)

   Негативыне кейсы:
   Отрицательные числа (должно выбрасываться исключение)
     */


    static Stream<Arguments> positiveCases(){
        return Stream.of(
                Arguments.of(0,1),
                Arguments.of(1,1),
                Arguments.of(5,120),
                Arguments.of(7,5040)
        );
    }

    @DisplayName("тест на 0 и маленькие числа")
    @ParameterizedTest
    @MethodSource("positiveCases")
    void factorialIsZeroAndSmallValue(int actual,int expected){
        assertEquals(expected,homeWork.factorial(actual));
    }

    @DisplayName("Тест на большое число")
    @Test
    void factorialIsBigValue(){
        assertThrows(ArithmeticException.class,()-> homeWork.factorial(100));
    }

    @DisplayName("Отрицательные числа")
    @Test
    void factorialIsNotPositiveValue(){
        assertThrows(IllegalArgumentException.class,()-> homeWork.factorial(-100));
    }
}
