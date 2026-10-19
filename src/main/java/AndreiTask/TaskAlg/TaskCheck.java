package AndreiTask.TaskAlg;

import java.util.stream.Stream;

public class TaskCheck {

    public static void main(String[] args) {
        try {
            try {
                throw new Exception("");
            } catch (RuntimeException e) {
                System.out.print("1");
            } finally {
                System.out.print("2");
            }
            System.out.print("3");
        } catch (Exception e) {
            System.out.print("4");
        } finally {
            System.out.print("5");
        }
        System.out.print("6");
    }
}

