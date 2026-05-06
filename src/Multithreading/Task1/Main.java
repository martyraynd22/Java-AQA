package Multithreading.Task1;

public class Main {
    static void main(String[] args)  {
        Thread t1 = new Thread(()->{
            for (int i = 0; i < 5; i++){
                try {
                    System.out.println("Привет из потока!");
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        t1.start();
    }
}
