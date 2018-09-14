import java.util.Scanner;
class occur
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string: ");
		String st = sc.nextLine();
		System.out.println("enter the string to be checked: ");
		String findSt = sc.nextLine();
		int lastIndex = 0;
		int count = 0;
		while(lastIndex != -1)
		{
		    lastIndex = st.indexOf(findSt,lastIndex);
		    if(lastIndex != -1)
		    {
		        count ++;
		        lastIndex += findSt.length();
		    }
		}
		System.out.println("the string appears "+count+" times");
	}
}