package Multithreading.Task4;

public class Counter {
    private volatile int count;

    public synchronized void increment(){
        count++;
    }

    public int getCount() {
        return count;
    }
}
