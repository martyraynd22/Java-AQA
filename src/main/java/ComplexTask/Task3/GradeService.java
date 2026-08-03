package ComplexTask.Task3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class GradeService <T extends Number> {

    List<StudentGrade<T>> studentGrades = new ArrayList<>();

    public synchronized void addGrade(StudentGrade<T> grade){
        if(grade.getGrade() == null){
            throw new InvalidGradeException("Оценка не может быть null");
        }
        if(grade.getGrade().doubleValue() <= 0){
            throw new InvalidGradeException("Оценка не может быть отрицательной");
        }
        studentGrades.add(grade);
    }

    public double studentGrades(String object){
        return studentGrades.stream()
                .filter(studentGrades -> studentGrades.getObject().equals(object))
                .mapToDouble(studentGrades -> studentGrades.getGrade().doubleValue())
                .average()
                .orElse(0.0);
    }


    }
