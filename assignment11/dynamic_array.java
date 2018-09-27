import java.util.*;
class DynamicArray
{
	private static final int initialSize=5;
	public static int[] increaseSize(int arr[])
	{
		int newArr[]=new int[arr.length+initialSize];
        for(int i=0;i<arr.length;i++)
        {
        	newArr[i]=arr[i];     
        }
        return newArr;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array: ");
		int size=sc.nextInt();
		System.out.println("enter the elements: ");
		int arr[]=new int[initialSize];
		for(int i=0;i<size;i++)
		{
			if(i<initialSize)
			{
				arr[i]=sc.nextInt();
			}
			else
			{
				arr=increaseSize(arr);
				arr[i]=sc.nextInt();
			}
		}
		if(size>initialSize)
		{
			System.out.println("size of array is: "+arr.length+"\nsize increased by 2 times.of previous array.");
		}
		System.out.println("new array is: ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}