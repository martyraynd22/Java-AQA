package AndreiTask.TaskAlg;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Task30 {
    public static int[] twoSum(int[] nums, int target) {
        for ( int i = 0; i < nums.length; i++) {
            for (int k = i + 1; k < nums.length; k++) {
                if (nums[i] + nums[k] == target) {
                    return new int[]{i, k};
                }
            }
        }
        return new int[0];
}

    public static void main(String[] args) {
        int[] c = {1,2,3,4,5,6};
        System.out.println(Arrays.toString(twoSum(c,3)));

    }

}
