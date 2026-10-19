package AndreiTask.TaskAlg;



public class Task7 {
    static int count(String s){
        int count = 0;
        for (char c : s.toLowerCase().toCharArray()){
            if("aeiouаеёиоуыэюя".indexOf(c) >= 0){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(count("hfjsdfhsydfgfgA"));
    }
}
