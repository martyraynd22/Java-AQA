package ComplexTask.Task6;
import java.time.LocalDate;

public class Task <T> {
    private T id;
    private String status;
    private Priority priority;
    private LocalDate date;

    public Task(T id,String status, Priority priority, LocalDate date){
        this.id = id;
        this.status = status;
        this.priority = priority;
        this.date = date;
    }

    public T getId() {
        return id;
    }

    public String getStatus() {
        return status;
    }

    public Priority getPriority(){
        return priority;
    }

    public LocalDate getDate(){
        return date;
    }

    @Override
    public String toString() {
        return id.toString() + " " + status + " " + priority + " " + date;
    }
}
