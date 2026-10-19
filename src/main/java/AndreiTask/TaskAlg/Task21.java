package AndreiTask.TaskAlg;

import java.util.ArrayList;
import java.util.List;

public class Task21 {
    public static boolean element(List<Integer> list, int s) {
        return (list.contains(s));
    }

    public static void main(String[] args) {
        System.out.println(element(new ArrayList<>(List.of(1,2,3,4)),1));
    }
}