package ComplexTasks.Task6;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TaskService <T> {
    private List<Task<T>> taskList;

    public TaskService() {
        this.taskList = new ArrayList<>();
    }

    public List<Task<T>> getTaskList() {
        return taskList;
    }

    public void addTask(Task<T> task){
        if (task.getId() == null){
            throw new IllegalArgumentException("ID задачи не может быть null");
        }
        if (!this.taskList.contains(task)){
            this.taskList.add(task);
        }
    }

    public synchronized boolean removeTask(T id){
        if (id == null){
            throw new IllegalArgumentException("ID задачи не может быть null");
        }
        return taskList.removeIf(task -> task.getId().equals(id));
    }

    public Map<Priority, List<Task<T>>> filterByPriority(Priority priority){
        if (priority == null){
            throw new IllegalArgumentException("Приоритет не может быть null");
        }
        return this.taskList.stream()
                .collect(Collectors.groupingBy(Task::getPriority,Collectors.toList()));
    }

    public List<Task> sortedByDate(){
        return this.taskList.stream()
                .sorted(Comparator.comparing(Task::getDate))
                .collect(Collectors.toUnmodifiableList());
    }

    public Map<String, List<Task<T>>> filterByStatus() {
        return this.taskList
                .stream()
                .collect(Collectors.groupingBy(k -> k.isClosed() ? "Закрытые" : "Открытые", Collectors.toList()));
    }

}
