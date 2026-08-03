package ComplexTask.Task6;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        TaskService<Integer> taskService = new TaskService<>();
        taskService.addTask(new Task<>(1,"open",Priority.HIGH, LocalDate.now()));
        taskService.addTask(new Task<>(3,"closed",Priority.MEDIUM, LocalDate.now()));
        taskService.addTask(new Task<>(5,"closed",Priority.HIGH, LocalDate.now()));
        taskService.addTask(new Task<>(7,"open",Priority.LOW, LocalDate.now()));
        taskService.addTask(new Task<>(11,"closed",Priority.LOW, LocalDate.now()));

        System.out.println(taskService.deleteTaskV2(3));
    }
}
