package TestComplexTasks.Task3;

import ComplexTasks.Task3.StudentGrade;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AverageGradeByItemTest extends Precondition {
    //Позитивные кейсы:
    //Предмет с 2 оценками -> среднее равно 5
    // Предмет с 3 оценками -> срнеднее равно 5
    //Корнер кейс:
    //Проверить по несуществующему предмету -> NoSuchException
    //Негативные кейсы:
    //Предмет null -> IllegalArgumentException

    private StudentGrade<Double> k;
    private StudentGrade<Double> y;
    private StudentGrade<Double> z;


    @BeforeEach
    void setUp(){
        this.k = new StudentGrade<>("Данила","Физика",5.0);
        this.y = new StudentGrade<>("Софа","Физика",4.0);
        this.z = new StudentGrade<>("Саша","Физика",6.0);
    }

    @Test
    @DisplayName("Предмет с 2 оценками")
    void checkingAvg_If_Add_Two_Grade(){
        targetClass.addGrade(y);
        targetClass.addGrade(z);
        assertEquals(5.0,targetClass.averageGradeByItem("Физика"));
    }

    @Test
    @DisplayName("Предмет с 3 оценками")
    void checking_Avg_If_Add_Three_Grade(){
        targetClass.addGrade(k);
        targetClass.addGrade(y);
        targetClass.addGrade(z);
        assertEquals(5.0,targetClass.averageGradeByItem("Физика"));
    }

    @Test
    @DisplayName("Средняя оценка по несуществующему предмету")
    void сhecking_A_Non_Existent_item(){
        assertThrows(NoSuchElementException.class,()-> targetClass.averageGradeByItem(""));
    }

    @Test
    @DisplayName("Средняя оценка по несуществующему предмету")
    void сhecking_Null_item(){
        assertThrows(IllegalArgumentException.class,()-> targetClass.averageGradeByItem(null));
    }
}
