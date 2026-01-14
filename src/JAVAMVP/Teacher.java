package JAVAMVP;

public class Teacher {
    String name;
    String subject;


    public Teacher(String newName, String newSubject) {
        this.name = newName;
        this.subject = newSubject;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public String getName() {
        return this.name;
    }

    public String getSubject() {
        return this.subject;
    }

    public void setSubject(String newSubject) {
        this.subject = newSubject;
    }
       void print(){
            System.out.println("Имя преподователя " + this.name +"\n" + "Название предмета " + this.subject);
        }

}

