package AndreiTask.TaskAlg;

public class Task25 {
    public static String string (char[] s){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length;i++){
            if (sb.length() > 0) {
                sb.append(' ');
            }
            sb.append(i);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(string(new char[]{1,2,3,4,4,5,6}));
    }
}
