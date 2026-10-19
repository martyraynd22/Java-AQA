package AndreiTask.TaskAlg;

public class Task31 {
    public static boolean isPalindrom(String string){
        String clean = string.toLowerCase().trim().replaceAll("\\s+","");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(clean).reverse();
        return stringBuilder.toString().equals(clean);
    }

    public static void main(String[] args) {
        System.out.println(isPalindrom("DAD"));
        System.out.println(isPalindrom("DADA"));
    }
}
