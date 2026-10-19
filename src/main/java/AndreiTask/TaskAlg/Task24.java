package AndreiTask.TaskAlg;

import java.util.ArrayList;
import java.util.List;

public class Task24 {
    public static List<Integer> list(List<Integer> l1,List<Integer> l2){
        if (l1 == null || l1.isEmpty() || l2 == null || l2.isEmpty()){
            throw new IllegalArgumentException("Один из списков не может быть пустым или равен нуллу");
        }
        List<Integer> s = new ArrayList<>(l1);
        s.addAll(l2);
        return s;
    }

    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>(List.of(1,2,3,4,5,6));
        List<Integer> l2 = new ArrayList<>(List.of(2,3,4,5,6,7));
        System.out.println();
    }
}
