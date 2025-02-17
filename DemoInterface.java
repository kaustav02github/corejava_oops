


 interface A {

void show();
void config();
    
}

class B implements A{
    public void show(){
        System.out.println("Show");
    }
    public void config(){
            System.out.println("Config");
        }
}

 class DemoInterface {
    public static void main(String[] args) {
    A obj;
    obj=new B();
    obj.show();
    obj.config();
    }
 }