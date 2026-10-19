package ComplexTasks.Task3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        StudentGrade<Double> studentGrade1 = new StudentGrade<>("Петя", "Математика", 6.0);
        StudentGrade<Double> studentGrade2 = new StudentGrade<>("Петя", "Математика", 4.0);
        StudentGrade<Double> studentGrade3 = new StudentGrade<>("Петя", "Физика", 1.0);
        StudentGrade<Double> studentGrade4 = new StudentGrade<>("Петя", "Физика", 3.0);

        GradeService<Double> gradeService = new GradeService<>();
        gradeService.addGrade(studentGrade1);
        gradeService.addGrade(studentGrade2);
        gradeService.addGrade(studentGrade3);
        gradeService.addGrade(studentGrade4);

        System.out.println(gradeService.averageGradeByItem("Математика"));
        System.out.println(gradeService.averageGradeByItem("Физика"));
    }
}
