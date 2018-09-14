import java.util.Scanner;
class SubString
{
 public static void main(String args[])
 {
  int i,j;
  Scanner sc = new Scanner(System.in);
  System.out.println("Enterr string ");
  String str = sc.nextLine();
  for (i = 0; i < str.length(); i++) 
	{
	for (j = i+1; j <= str.length(); j++)
		{
			System.out.println(str.substring(i, j));
		}
	}	 
 }
}