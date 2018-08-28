class Stat
{
  static 
  {
   System.out.println("Welcome to static");
  }
 public static void main(String args[])
 {
  System.out.println("In the main block");                //instead of prining first in main,it will print value of static 
 }                                                         // in sequence as static loads when the class loads   
 static 
  {
   System.out.println("exit to static");
  }
}
