package AndreiTask.TaskAlg;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Task28 {
    public static List<String> sortedString(List<String> list){
        list.sort(Comparator.comparing(s -> s.length()));
        return list;
    }

    public static void main(String[] args) {
        System.out.println(sortedString(new ArrayList<>(List.of("Д","LLLLL","AA","A","AAAAAAAAAAA","KKKK"))));
    }
    }

