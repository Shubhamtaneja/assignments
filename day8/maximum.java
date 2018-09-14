import java.util.Scanner;
class Max
{
	public static void main(String args[])
	{
		String str1;
		String str2;
		System.out.println("enter no");
		Scanner sc=new Scanner(System.in);
		str1=sc.nextLine();
		str2=sc.nextLine();
		Integer a=Integer.valueOf(str1);
		Integer b=Integer.valueOf(str2);
		Integer c=a>b?a:b;
		System.out.println("max "+c);
	}
}