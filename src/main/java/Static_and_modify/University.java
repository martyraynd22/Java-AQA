package Static_and_modify;

public class University {
    static String universityName;
    final int studentID;
    String studentName;
    static int counter = 0;

    public University(String studentName){
        this.studentName = studentName;
        studentID = counter;
        counter ++;
    }

    static void changeUniversityName(String newName){
        universityName = newName;
    }

    public String getStudentName(){
        return this.studentName;
    }

    void  printStudentInfo(){
        System.out.println("Имя студента: " + studentName + " Айди: " + studentID + " Университет: " + universityName);
    }


}
