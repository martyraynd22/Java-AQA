package AndreiTask.TaskAlg;

public class Task2 {
    static int sum(int[] s){
        int count = 0;
        for (int number : s ){
            count += number;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(sum(new int[]{1, 2, 3, 4, 5}));
     }
}
