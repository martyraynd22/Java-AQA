package AndreiTask.TaskAlg;

public class Task5 {
    static int factorial(int n){
        int factorial = 1;
        for(int i = 2; i <= n; i++){
            factorial *= i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}
