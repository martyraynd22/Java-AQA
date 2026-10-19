package AndreiTask.TaskAlg;

public class Task29 {
    public static String replaceString(String string){
        return string.replaceAll("\\s+","");
    }

    public static void main(String[] args) {
        System.out.println(replaceString(" Даня Вася Коля, Петя   Семен"));
    }
}
