package AndreiTask.TaskAlg;

import java.util.List;

public class Task10 {
    public static int countWords(String s){
        if (s.isEmpty() || s == null )
        {return 0;}
        return s.trim().toLowerCase().split("\s").length;
    }

    public static void main(String[] args) {
        System.out.println(countWords(" мама папа деда "));
    }

}
