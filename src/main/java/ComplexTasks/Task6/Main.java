package ComplexTasks.Task6;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Task<Integer> task1 = new Task<>(1, Priority.HIGH,  LocalDate.now());
        Task<Integer> task2 = new Task<>(2, Priority.MEDIUM,LocalDate.now());
        Task<Integer> task3 = new Task<>(3, Priority.MEDIUM,  LocalDate.now());
        Task<Integer> task4 = new Task<>(4, Priority.HIGH, LocalDate.now());

        TaskService<Integer> taskService = new TaskService<>();
        taskService.addTask(task3);
        taskService.addTask(task2);
        taskService.addTask(task1);
        taskService.addTask(task4);

        System.out.println(taskService.getTaskList());
        taskService.removeTask(4);
        System.out.println(taskService.getTaskList());
        System.out.println(taskService.filterByStatus());
        System.out.println(taskService.filterByPriority(Priority.HIGH));
        System.out.println(taskService.sortedByDate());
    }
}
