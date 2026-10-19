package AndreiTask.TaskAlg;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Task17 {
    public static List<String> list(List<String> list){
        if (list == null || list.size() == 0){
            throw new IllegalArgumentException("Лист не может быть null или пустым");
        }
        return list.stream()
                .filter(s -> s.trim().toLowerCase().startsWith("a"))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println(list(new ArrayList<>(List.of("AYRA","MAMA","KDFA","aKKA","FHF","A"," a "))));
    }
}
