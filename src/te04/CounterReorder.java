package te04;

public class CounterReorder {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) counter.increment();
        });
        
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) counter.increment();
        });

        t1.start(); // [ B ]	starts the first thread t1
        t1.join(); // [ A ]		waits for t1 to finish before proceeding to the next line
        t2.start(); // [ D ]	starts the second thread t2
        t2.join(); // [ E ]		waits for t2 to finish before proceeding to the next line
        
        System.out.println("Final count: " + counter.getCount()); // [ C ]
    }
}