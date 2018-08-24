import java.util.Scanner;
class Prime
{
 public static void main(String args[])
 {
  int n;
  Scanner sc= new Scanner(System.in);
  System.out.print("Enter number:");
  n=sc.nextInt();
  System.out.println("Prime numbers upto "+n+" :");
  for(int i=2;i<=n;i++)
	{ 
		int count=0;
		for(int j=2;j<i;j++) 
		{
			if(i%j==0)
			{
				count=1;
				break;
			}
		}
		if (count ==0)
			{
				System.out.println(i);
			}
	}	
 }
}