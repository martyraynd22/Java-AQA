package AndreiTask.TaskAlg;

import java.util.HashMap;
import java.util.Map;

public class Task26 {
    public static Map<String,Integer> countWords(String string) {
        Map<String, Integer> map = new HashMap<>();
        for (String string1 : string.toLowerCase().split("\\s")){
            map.put(string1, map.getOrDefault(string1,0)+1);
        }
        return map;
    }
    }

