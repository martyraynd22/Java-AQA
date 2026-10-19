package ComplexTasks.Task6;

import java.time.LocalDate;
import java.util.Objects;

public class Task <T> {
    private final T id;
    private Priority priority;
    private Status status;
    private final LocalDate date;
    boolean isClosed;

    public Task(T id, Priority priority, LocalDate date) {
        this.id = id;
        this.priority = priority;
        this.date = date;
    }


    public T getId() {
        return id;
    }

    public Priority getPriority() {
        return priority;
    }

    public Status getStatus() {
        return status;
    }

    public LocalDate getDate() {
        return date;
    }


    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", priority=" + priority +
                ", status=" + status +
                ", date=" + date +
                '}';
    }

    public boolean isClosed() {
        return isClosed;
    }

    public void closeTask() {
        this.isClosed = true;
    }

}
