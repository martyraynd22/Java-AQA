package SolutionManual.Jenerics;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static <T> void soutList(List<T> list){
        for (T elements : list){
            System.out.println(elements);
        }
    }
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<String>(List.of("Danila","Nikita","Andrey","Sofa"));
        List<Integer> list2 = new ArrayList<Integer>(List.of(1,2,3,4,5,6));

        soutList(list1);
        soutList(list2);

    }
}
