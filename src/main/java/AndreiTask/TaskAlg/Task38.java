package AndreiTask.TaskAlg;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Task38 {

    public static int[] countNums(int [] nums){
        int chet = (int) Arrays.stream(nums)
                .filter(s -> s % 2 == 0)
                .count();
        return new int[]{chet,nums.length - chet};
    }

    public static void main(String[] args) {
        int [] s = {0,1,2,3,4,5,6,7,8,9,10};
        System.out.println(Arrays.toString(countNums(s)));
    }
}
