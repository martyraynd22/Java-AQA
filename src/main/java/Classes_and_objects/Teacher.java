package Classes_and_objects;

public class Teacher {
    String name;
    String subject;

    public Teacher(String newName, String newSubject){
        this.name = newName;
        this.subject = newSubject;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setSubject(String newSubject){
        this.subject = newSubject;
    }
    public String getName(){
        return  this.name;
    }
    public  String getSubject(){
        return  this.subject;
    }
    void printInfo(){
        System.out.println("Имя учителя " + this.name + " " + "Предмет " + this.subject);
    }
}
