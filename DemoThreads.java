class A extends Thread
{
    public void run(){// run method of Thread class
        for(int i=1;i<=100;i++)
        {
            System.out.println("Hi");
        }
    }
}
class B extends Thread
{
   public void run(){// run method of Thread class
        for(int i=1;i<=100;i++)
        {
            System.out.println("Hello");
        }
    }
}


public class DemoThreads {
    
    public static void main(String[] args) {
    A obj1=new A();
    B obj2=new B();
    
    obj2.setPriority(Thread.NORM_PRIORITY);

    obj1.start();
    obj2.start();;
    }

}
//run methods are called by start method of Thread class