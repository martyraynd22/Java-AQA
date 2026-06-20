package ComplexTask.Task1;

import java.util.Objects;

public abstract class User {
    private int age;
    private String name;
    private boolean isActive;

    public User(int age,String name, boolean isActive){
        this.age = age;
        this.name = name;
        this.isActive = isActive;
    }

    public User() {
    }

    public int getAge(){
        return this.age;
    }

    public String getName(){
        return this.name;
    }

    public boolean isActive(){
        return this.isActive;
    }
    @Override
    public boolean equals(Object o){
        if (o == null || getClass() != o.getClass()) return false;
        User that = (User) o;
        return that.age == age && Objects.equals(that.name,name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age,name);
    }

    @Override
    public String toString(){
        return name + " " + age + " " + isActive;
}



}
