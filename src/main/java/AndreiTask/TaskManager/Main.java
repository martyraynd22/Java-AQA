package AndreiTask.TaskManager;

public class Main {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();
        Task ubgradeUI = new Task(Status.NEW,Priority.HIGH,"Обновить дизайн макеты главной страницы сайта");
        Task ubgradeUX = new Task(Status.NEW,Priority.HIGH,"Обновить дизайн макеты страницы оплаты");
        Task ubgradeUGC = new Task(Status.IN_PROGRESS,Priority.LOW,"Апгрейд флоу авторизации");
        Task ubgradeU = new Task(Status.IN_PROGRESS,Priority.HIGH,"Апгрейд флоу регистрации");
        Task ubgradeK = new Task(Status.IN_PROGRESS,Priority.HIGH,"Апгрейд флоу ");
        Task ubgradeA = new Task(Status.IN_PROGRESS,Priority.HIGH,"Апгрейд регистрации");
        Task ubgradeS = new Task(Status.IN_PROGRESS,Priority.HIGH,"Апгрейд ");
        taskManager.board.add(ubgradeUI);
        taskManager.board.add(ubgradeUX);
        taskManager.board.add(ubgradeUGC);
        taskManager.board.add(ubgradeU);
        taskManager.board.add(ubgradeK);
        taskManager.board.add(ubgradeA);
        taskManager.board.add(ubgradeS);
        System.out.println(taskManager.board);
        System.out.println(taskManager.filterStatusAndPriority(Status.IN_PROGRESS,Priority.LOW));
        System.out.println(taskManager.filterStatusAndPriority(Status.IN_PROGRESS,Priority.HIGH));
    }
}
