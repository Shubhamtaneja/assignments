import java.util.Scanner;
import java.util.List;
import java.util.Arrays;

class Arr
{
 public static void main(String args[])
 {
  Scanner sc= new Scanner(System.in);
  {
   int len;
   System.out.println("Enter length");
   len=sc.nextInt();
   int[] a=new int[len];
   for(int i=0;i<len;i++)
   {
    System.out.println("Enter values"+(i+1));
	a[i]=sc.nextInt();
   }
   Arrays.sort(a);
   sc.close();
   System.out.println("After Sorting ");
   for(int i=0;i<len;i++)
   {
    System.out.println(a[i]);
   }
   System.out.println("Second Highest Element is "+a[a.length-2]);
   
  }
 }
}