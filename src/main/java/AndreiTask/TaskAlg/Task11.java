package AndreiTask.TaskAlg;

import java.util.ArrayList;
import java.util.List;

public class Task11 {
    public static int count(List<Integer> list){
        int count = 0;
        for (int s : list){
            count += s;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(count(new ArrayList<>(List.of(1,2,3,4))));
    }
}
