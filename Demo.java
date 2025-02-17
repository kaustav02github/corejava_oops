abstract class Car{
    abstract void drive();//declaring abstract method in abstract class
    abstract void autodrive();
     public void playMusic(){
        System.out.println("Playing Music..");
     }
}
 abstract class Bolero extends Car{
    void drive(){
        System.out.println("Driving my Bolero");
    }
}
class Tesla extends Bolero{
 void autodrive()
 {
    System.out.println("Auto Driving MODE ON...");
 }
}

 class Demo{
    public static void main(String[] args) {
      Car t=new Tesla();
        t.drive();
        t.playMusic();
        t.autodrive();
    }
}