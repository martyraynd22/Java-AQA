package JAVAMVP;

public class Student {
    int age;
    String name ;

    Student (int someAge, String someName) {
        this.age = someAge;
        this.name = someName;
        }
    int getAge() {
        return this.age;
    }
    void SetAge(int newAge){
        this.age = newAge;
    }
    void setName (String newName){
        this.name = newName;
    }

    void  print() {
        System.out.println("Возраст "  + this.age + " Имя " + this.name);
    }
    }

