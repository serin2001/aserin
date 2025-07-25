package te04;

public class Counter {
    private int count = 0;
    // synchronized method ensures that only one thread can increment the count at a time
    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}