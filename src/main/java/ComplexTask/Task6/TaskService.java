package ComplexTask.Task6;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TaskService<T>{

    List<Task<T>> tasks = new ArrayList<>();

    public void addTask(Task<T> task){
        tasks.add(task);
    }

    public synchronized boolean deleteTask(T id){
        for (int i = 0; i < tasks.size();i++){
            if (tasks.get(i).getId().equals(id)) {
                tasks.remove(i);
                return true;
            }
        }
        return false;
    }

    public synchronized boolean deleteTaskV2(T id){
        return tasks.removeIf(tTask -> tTask.getId().equals(id));
    }

    public List<Task<T>> findTasksByStatus( String status){
        return tasks.stream()
                .filter(task -> task.getStatus().equals(status))
                .collect(Collectors.toList());
    }

    public List<Task<T>> findTasksByPriority(Priority priority){
        return tasks.stream()
                .filter(task -> task.getPriority().equals(priority))
                .collect(Collectors.toList());
    }

    public List<Task<T>> sortedTaskByDate(LocalDate date){
        return tasks.stream()
                .sorted()
                .collect(Collectors.toList());
    }
        }

