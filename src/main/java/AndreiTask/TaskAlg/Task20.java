package AndreiTask.TaskAlg;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Task20 {
    public static List<Integer> list (List<Integer> list){
        if (list == null || list.isEmpty()){
            throw new IllegalArgumentException("Лист не может быть пустым или быть null");
        }
        return list.stream()
                .filter(n -> n % 2 == 1)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println(list(new ArrayList<>(List.of(2,4,6,8))));
    }
}
