import java.util.Scanner;
class Ar
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		
		int[] arr={1,4,6,7,8,9,10};
		int number;
		System.out.print("Enter the number you want to search :");
		number=sc.nextInt();
		if (number<=arr[3])//if number is present in first four positions , as this array is in sorted form
		{
			for(int i=0;i<=3;i++)
			{
				if (arr[i]==number)
				{
					System.out.println("found number at :arr["+i+"]");
				}
			}
		}
		if (number>arr[3])//if number is present in after 4th element of an array
		{
			for(int i=4;i<=6;i++)
			{
				if (arr[i]==number)
				{
				System.out.println("found number at arr[:"+i+"]");
				}
			}
		}
	}
}