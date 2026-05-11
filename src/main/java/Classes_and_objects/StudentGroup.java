package Classes_and_objects;

public class StudentGroup {
    String groupName;
    int studentCount;

    public StudentGroup(String newGroupName, int newStudenCount){
        this.groupName = newGroupName;
        this.studentCount = newStudenCount;


    }

    public void setGroupName(String newGroupName){
        this.groupName = newGroupName;
    }

    public void setStudentCount(int newStudentCount) {
        this.studentCount = newStudentCount;
    }
       public String getGroupName(){
        return  this.groupName;
       }

    public int getStudentCount() {
        return this.studentCount;
    }

    void printInfo(){
        System.out.println("Имя группы " + this.groupName + " " + "Размер группы " + this.studentCount);
    }
}
