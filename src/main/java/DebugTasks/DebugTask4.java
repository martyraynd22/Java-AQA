package DebugTasks;

public class DebugTask4 {
    public static void main(String[] args) {
        System.out.println(isPalindrome("level"));
    }
    public static boolean isPalindrome(String str) {
        if(str == null){
            throw new IllegalArgumentException("Строка не может быть null");
        }
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }
}
