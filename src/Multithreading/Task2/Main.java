package Multithreading.Task2;

public class Main {
    static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(()->{
            for(int i = 0; i < 5; i++){
                try {
                    System.out.println("A");
                    Thread.sleep(150);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        Thread t2 = new Thread(()->{
            for (int i = 0; i < 5; i++){
                try {
                    System.out.println("B");
                    Thread.sleep(500);
                }
                catch (InterruptedException e){
                    throw new RuntimeException();
                }
            }
        });
        t1.start();
        t2.start();

    }
}
