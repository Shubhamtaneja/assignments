import java.util.Scanner;
class Rect
{
    
    public static void main(String args[])
    {  
       int num1,num2;
       System.out.println("Enter length and breath of rectangle");
       Scanner sc = new Scanner(System.in);
       num1=sc.nextInt();
       num2=sc.nextInt();
       Rect a = new Rect();
 
    System.out.println("Area is " +a.ar(num1,num2));
    }
    static int ar(int num1,int num2)
    {
      int num3;
      num3=num1*num2;
      return num3;
}
}