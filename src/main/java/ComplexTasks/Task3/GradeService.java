package ComplexTasks.Task3;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

public class GradeService<T extends Number> {
    private final List<StudentGrade<T>> gradeList;

    public GradeService() {
        this.gradeList = new ArrayList<>();
    }

    public List<StudentGrade<T>> getGradeList() {
        return List.copyOf(this.gradeList);
    }

    public synchronized void addGrade(StudentGrade<T> studentGrade) {
        if (studentGrade.getGrade() == null || !(studentGrade.getGrade().doubleValue() >= 0.0)) {
            throw new InvalidGradeException("Оценка не валидна");
        }
        this.gradeList.add(studentGrade);
    }

    public double averageGradeByItem(String item) {
        if (item == null) {
            throw new IllegalArgumentException("Subject null");
        }
        List<StudentGrade<T>> filteredListBySubject = this.gradeList
                .stream()
                .filter(grade -> grade.getItem().equals(item))
                .toList();
        if (filteredListBySubject.isEmpty()) {
            throw new NoSuchElementException("Оценок по предмету \"" + item + "\" нет");
        }
        return Math.round(filteredListBySubject
                .stream()
                .collect(Collectors
                        .averagingDouble(grade -> grade.getGrade().doubleValue())
                ) * 100.0) / 100.0;
    }
    }

