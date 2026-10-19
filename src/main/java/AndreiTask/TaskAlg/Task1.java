package AndreiTask.TaskAlg;

public class Task1 {


     static boolean isPalindrome(String s){
        String string = s.replaceAll("\\s+", "").toLowerCase();
        return new StringBuilder(string).reverse().toString().equals(string);
    }

    public static void main(String[] args) {
        System.out.println(Task1.isPalindrome("joj"));
    }
}
