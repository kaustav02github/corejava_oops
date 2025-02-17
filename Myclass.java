class A{
public void show(){
    System.out.println("inside Class A show ");

}
class B{//inner class
    public void innershow(){
        System.out.println("Inside Inner Class B Show ");
    }
}
}
class Myclass{
    public static void main(String args[]){
        A obj=new A()// annonymous inner class
        {
            public void show(){
                System.out.println("Inside new  annonymous class show");
            }
        };
        obj.show();


        A obj2=new A();
        obj2.show();

        //callinng inner class function with inner class object
        A.B obj3=new A().new B();
        obj3.innershow();
        
    }
}