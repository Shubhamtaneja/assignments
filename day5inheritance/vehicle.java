abstract class Vehicle
{
 abstract void start() ;
 void stop()
 {
 }
}
class Twowheeler extends Vehicle
{
 void start()
 {
  System.out.println("Two wheeler start"); 
 }
 void stop()
 {
  System.out.println("Two wheeler stop"); 
 }
}

class Fourwheeler extends Vehicle
{
 void start()
 {
  System.out.println("Four wheeler start"); 
 }
 void stop()
 {
  System.out.println("Four wheeler stop"); 
 }
}

class Displayvehicle
{
 public static void main(String args[])
 {
 Vehicle t=new Twowheeler();
 t.start();
 t.stop();
 Vehicle f=new Fourwheeler();
 f.start();
 f.stop();
}
}