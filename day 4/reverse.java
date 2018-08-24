import java.util.Scanner;
class Reversenumber
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int number,temp,remd,rev=0;
		System.out.print("Enter the number:");
		number=sc.nextInt();
		temp=number;
		while(temp!=0)
		{
			remd=temp%10;
			rev=rev*10+remd;
			temp=temp/10;
		}
		System.out.println("Reverse of number is : "+rev);
	}
}