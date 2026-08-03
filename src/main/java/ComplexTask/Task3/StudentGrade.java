package ComplexTask.Task3;

public class StudentGrade<T extends  Number> {
    private String name;
    private T grade;
    private String object;

    public StudentGrade(T grade,String name,String object){
        this.grade = grade;
        this.name = name;
        this.object = object;
    }

    public T getGrade(){
        return grade;
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(T grade){
        this.grade = grade;
    }

    public String getObject(){
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }
}
