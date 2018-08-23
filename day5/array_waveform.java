import java.util.Scanner;
import java.util.List;
import java.util.Arrays;

class Wave
{
 public static void main(String args[])
 {
  Scanner sc= new Scanner(System.in);
  {
   int len;
   Wave ob=new Wave();
   System.out.println("Enter length");
   len=sc.nextInt();
   int[] a=new int[len];
    
   for(int i=0;i<len;i++)
   {
    System.out.println("Enter values"+(i+1));
	a[i]=sc.nextInt();
   }
   Arrays.sort(a); 
   for(int i=0;i<len-1;i=i+2)
   {
	   ob.swap(a,i,i+1);
   }
    System.out.println("After operation ");
   for(int i=0;i<len;i++)
   {
    System.out.println(a[i]);
   }    
  }
 }
 void swap(int a[],int x,int y)
   {
	    int temp= a[x];
		a[x]=a[y];
		a[y]=temp;
   }
}