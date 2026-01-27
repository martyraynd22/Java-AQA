package Static_and_modify;

import java.util.UUID;

public class University {
    static String universityName;
    final int studentID;
    String studentName;
    static int counter = 0;


    public University(String studentName){
        this.studentName = studentName;
        this.studentID = counter;
        counter ++;
    }

    static void changeUniversityName(String newName){
      universityName = newName;
    }

    public String getStudentName(){
        return this.studentName;
    }

    void printStudentInfo(){
        System.out.println("Имя: " + studentName + ", Айди: " + studentID + ", Университет: " + universityName);
    }


}
