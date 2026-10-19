package AndreiTask.TaskAlg;

import java.util.*;

public class TaskRu {

    public static String charravnoSkobki(String s){
        Map<Character,Integer> skobki = new HashMap<>();
        for (char c : s.toLowerCase().toCharArray()){
            if (skobki.containsKey(c)) {
                skobki.put(c, skobki.get(c) + 1);
            } else {
                skobki.put(c, 1);
            }
            }
        StringBuilder sb = new StringBuilder();
        for (Integer integer : skobki.values()){
            if(integer > 1){
                sb.append(")");
            }
           else sb.append("(");
        }
        return sb.toString();
        }

    public static void main(String[] args) {
        System.out.println(charravnoSkobki("din"));
    }
}
