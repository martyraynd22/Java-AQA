package AndreiTask.TaskAlg;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Task18 {
    public static List<Integer> list(List<Integer> list){
        return list.stream()
                .collect(Collectors.toSet())
                .stream().toList();
    }

    public static void main(String[] args) {
        //System.out.println(list(new ArrayList<>(List.of("A","A","B","AB","C","C","C","Z","K"))));
    }
}
