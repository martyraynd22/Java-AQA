package AndreiTask.TaskAlg;

import java.util.Arrays;

public class Task9 {
    public static boolean annagramma(String s1, String s2){
        char[] slovo1 = s1.toLowerCase().toCharArray();
        char[] slovo2 = s1.toLowerCase().toCharArray();
        Arrays.sort(slovo1);
        Arrays.sort(slovo2);
        return Arrays.equals(slovo1,slovo2);
    }

    public static void main(String[] args) {
        System.out.println(annagramma("kot","tok"));
    }
}
