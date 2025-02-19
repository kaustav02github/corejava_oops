class Counter{
    int counter;
    public synchronized void increment()
    //if we give synchoronized keyword then only one thread can access this method at a time
    //the other thread has to wait for the first thread to finish
    {
        counter++;
        
    }
}


public class DemoThreads2 {
    public static void main(String[] args) throws InterruptedException {
    
    
    //i will make 2 annoymous object classes
    Counter c =new Counter();
Runnable obj1 = () -> {
    for (int i = 1; i <= 100; i++) {
        c.increment();
    }
};

Runnable obj2 = () -> {
    for (int i = 1; i <= 1000; i++) {
        c.increment();
    }
};
Thread t1=new Thread(obj1);
Thread t2=new Thread(obj2);

 t1.start();
 t2.start();
 t1.join();
 t2.join();
System.out.println(c.counter);
}
}
