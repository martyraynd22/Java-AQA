package AndreiTask.TaskManager;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TaskManager {
    List<Task> board = new ArrayList<>();

    public List<Task> filterStatusAndPriority(Status status,Priority priority){
        return board.stream()
                .filter(task -> task.status().equals(status) & task.priority().equals(priority))
                .toList();
    }

    public List<Task> sortedBoard(){
        return board.stream()
                .sorted(Comparator.comparing(Task :: priority))
                .toList();

    }

    public Map<Priority, List<Task>> filterTasksByPriority() {
        return this.board
                .stream()
                .collect(Collectors.groupingBy(Task::priority, Collectors.toList()));
    }

}
