abstract class A{// abstact class
    public abstract void show();

    public void write(){
        System.out.println("Write");
    }
}
class  B extends A{
    public void show(){
        System.out.println("Show");
    }
}

public class Abstract {
    public static void main(String[] args) {
      
        A obj=new B();
        obj.show();
        obj.write();

    }
    
}
