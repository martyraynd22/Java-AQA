package AndreiTask.TaskAlg;

public class Task3 {
    static int max(int[] s){
        int maximum = s[0];
    for (int number : s){
        if (number > maximum){
            maximum = number;
        }
    }
    return maximum;
    }

    public static void main(String[] args) {
        System.out.println(max(new int[]{99999,1, 2, 3, 4, 5,100}));
    }
}
