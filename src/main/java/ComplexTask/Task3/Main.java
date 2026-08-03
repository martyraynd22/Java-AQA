package ComplexTask.Task3;

public class Main {
    public static void main(String[] args) {
        GradeService<Integer> gradeService = new GradeService();
        StudentGrade<Integer> danila = new StudentGrade<>(8,"Danila","Математика");
        StudentGrade<Integer> andrei = new StudentGrade<>(9,"Andrei","Математика");
        StudentGrade<Integer> sasha = new StudentGrade<>(5,"Sasha","Математика");
        StudentGrade<Integer> sofa = new StudentGrade<>(3,"Sofa","Математика");
        StudentGrade<Integer> vasya = new StudentGrade<>(-2,"Vasya","Математика");

        gradeService.addGrade(danila);
        gradeService.addGrade(sasha);
        gradeService.addGrade(andrei);
        gradeService.addGrade(sofa);
        System.out.println(gradeService.studentGrades("Математика"));
        gradeService.addGrade(vasya);
    }
}
