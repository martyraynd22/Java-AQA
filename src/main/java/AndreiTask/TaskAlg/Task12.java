package AndreiTask.TaskAlg;

import java.util.HashSet;
import java.util.Set;

public class Task12 {
    public static boolean checkUnique(int[] s){
        if(s == null || s.length == 0){
            return false;
        }
        Set<Integer> uniq = new HashSet<>();
        for (int c: s){
            if (!uniq.add(c)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(checkUnique(new int[]{1,2,3,4,5,6,10}));
    }
}
