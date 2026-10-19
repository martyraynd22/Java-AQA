package AndreiTask.TaskAlg;

public class Task16 {
    public static int divide (int a, int b){
        try {
            return a/b;
        } catch (ArithmeticException e) {
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(divide(4,2));
        System.out.println(divide(4,0));
    }
}
