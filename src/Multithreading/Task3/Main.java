package Multithreading.Task3;

public class Main {
    private static volatile int counter = 0;
    private static volatile boolean stop = false;
    public static void main(String[] args) throws InterruptedException{
        Thread t1 = new Thread(()->{
            while (!stop){
                 counter++;
            }
        });
        t1.start();
        Thread.sleep(2000);
        stop = true;
        t1.join();
        System.out.println("Наш счетчки досчитал до: " + counter);

    }
}
