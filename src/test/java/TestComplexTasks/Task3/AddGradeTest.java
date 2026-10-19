package TestComplexTasks.Task3;

import ComplexTasks.Task3.InvalidGradeException;
import ComplexTasks.Task3.StudentGrade;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AddGradeTest extends Precondition {
    //Позитивные кейсы:
    // Различные положительные числа  -> Добавиться
    // 0 -> Добавиться
    //Негативыне кейсы:
    // null -> InvalidGradeException
    // меньше 0 -> InvalidGradeException

    @Test
    @DisplayName("Различные положительные grade")
    void check_Positive_Numbers_Add_Grade() {
        Thread t1 = new Thread(() -> targetClass.addGrade(new StudentGrade<>("A", "B", 5.0)));
        Thread t2 = new Thread(() -> targetClass.addGrade(new StudentGrade<>("A", "B", 66.0)));
        Thread t3 = new Thread(() -> targetClass.addGrade(new StudentGrade<>("A", "B", 22.0)));
        Thread t4 = new Thread(() -> targetClass.addGrade(new StudentGrade<>("A", "B", 1.0)));
        t1.start();
        t2.start();
        t3.start();
        t4.start();

        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        assertEquals(4,targetClass.getGradeList().size());
    }

    @Test
    @DisplayName("Добавить grade == 0")
    void add_Zero_To_Grade(){
        targetClass.addGrade(new StudentGrade<>("C","D",0.0));
        assertEquals(1,targetClass.getGradeList().size());
    }

    @Test
    @DisplayName("Добавить grade == null")
    void return_InvalidGradeException_If_Аdd_Null_To_Grade(){
        assertThrows(InvalidGradeException.class,()->targetClass.addGrade(new StudentGrade<>("Danya","A",null)));
    }

    @Test
    @DisplayName("Добавить grade меньше 0")
    void return_InvalidGradeException_If_Аdd_Negative_Values_To_Grade(){
        assertThrows(InvalidGradeException.class,()->targetClass.addGrade(new StudentGrade<>("Katya","A",-5.0)));
    }
}
