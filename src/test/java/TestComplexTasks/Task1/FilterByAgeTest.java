package TestComplexTasks.Task1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class FilterByAgeTest extends Precondition {
    //Позитивные кейсы:
    //Фильтр от 15 до 30 -> 3 Entity
    //Фильтр от 19 до 26 -> 2 Entity
    //Негативные кейсы:
    //Фильтр от 0 до 0
    //Корнер кейсы:
    //Фильтр от 15 до 15

    public static Stream<Arguments> possitiveCase(){
        return Stream.of(
                Arguments.of(14,30,3),
                Arguments.of(19,26,2)
        );
    }

    @ParameterizedTest
    @MethodSource("possitiveCase")
    @DisplayName("Фильтр от 15 до 30 и Фильтр от 19 до 26")
    void filter_By_Multiple_Values(int age1,int age2,int elemntCount){
        targetClass.addEntity(e1);
        targetClass.addEntity(e2);
        targetClass.addEntity(e3);
        assertEquals(elemntCount,targetClass.filterByAge(age1,age2).size());
    }

    @Test
    @DisplayName("Фильтр от 0 до 0")
    void filter_Zero_Values(){
        assertTrue(targetClass.filterByAge(0,0).isEmpty());
    }

    @Test
    @DisplayName("Фильтр от 15 до 15")
    void age_Filter_From_Fifteen_To_Fifteen(){
        targetClass.addEntity(e1);
        targetClass.addEntity(e2);
        targetClass.addEntity(e3);
        assertEquals(1,targetClass.filterByAge(15,15).size());
    }

}
