package AndreiTask.TaskAlg;

public class Task23 {
    public static boolean check(String s){
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
