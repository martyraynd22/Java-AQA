package ComplexTasks.Task3;

import java.util.Objects;

public class StudentGrade<T extends Number> {
    private String name;
    private String item;
    private T grade;

    public StudentGrade(String name, String item, T grade) {
        this.name = name;
        this.item = item;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public String getItem() {
        return item;
    }

    public T getGrade() {
        return grade;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        StudentGrade<?> that = (StudentGrade<?>) o;
        return Objects.equals(name, that.name) && Objects.equals(item, that.item) && Objects.equals(grade, that.grade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, item, grade);
    }

    @Override
    public String toString() {
        return "StudentGrade{" +
                "name='" + name + '\'' +
                ", item='" + item + '\'' +
                ", grade=" + grade +
                '}';
    }
}
