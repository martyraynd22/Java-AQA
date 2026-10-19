package AndreiTask.TaskAlg;

import java.util.Queue;

public class Task27 {
    public static String printWord(Queue<String> queue){
        while (!queue.isEmpty()){
            System.out.println(queue.poll());
        }
        return null;
    }

    public static void main(String[] args) {
        Queue<String> queue = null;
        queue.add("Данила");
        queue.add("Софа");
        queue.add("Андрей");
        queue.add("Саша");
        queue.add("Петя");
        System.out.println(printWord(queue));
    }
}
