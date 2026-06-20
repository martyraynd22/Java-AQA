package SolutionManual.Jenerics;

import java.util.*;

public class Task5 {

    public static <T extends  Comparable<T>> T minimalElement(List<T> list) {
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("Список не может быть пустым");
        } else {
            return Collections.min(list);
        }
    }

    public static <T extends Comparable<T>> T findMinStream(List<T> list) {
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("Список не может быть пустым или null");
        }
        return list.stream().min(Comparable::compareTo).get();
    }

    public static void main(String[] args) {
        List<String> lis1 = new ArrayList<>(List.of("L","La","LALA","1","D"));
        List<Integer> lis2 = new ArrayList<>(List.of(1,434,54,5,0,12));

        System.out.println(minimalElement(lis1));
        System.out.println(minimalElement(lis2));

    }
}
