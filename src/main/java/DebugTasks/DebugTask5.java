package DebugTasks;

public class DebugTask5 {
    public static void main(String[] args) {
        Person person = new Person("Alice", 25);
        person.setNewAge();
        System.out.println("Updated age: " + person.getAge());
    }
}
