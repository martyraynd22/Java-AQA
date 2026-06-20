package SolutionManual.Jenerics;

import java.util.ArrayList;
import java.util.List;

public class Task6 {

    public static <T> void checkedList(List<T> list){
        if(list == null || list.isEmpty()){
            throw new IllegalArgumentException("Список не может быть пустым");
        }
        else return;
    }

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(List.of(1,2,3));
        List<Integer> list2 = new ArrayList<>();
        checkedList(list2);
    }
}
