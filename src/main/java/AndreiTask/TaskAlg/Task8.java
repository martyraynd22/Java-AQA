package AndreiTask.TaskAlg;

import java.util.Arrays;

public class Task8 {
    public static int twoMax(int[] n){
        int max = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int s : n) {
            if (s > max) {
                second = max;
                max = s;
            } else if (s > second && s != max) {
                second = s;
            }
        }
        return second;
    }

    public static void main(String[] args) {
        System.out.println(twoMax(new int[]{1,2,3,4,5,6}));
    }
}
