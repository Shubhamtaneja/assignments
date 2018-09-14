import java.util.Scanner;
class RemoveVowel
{
 public static void main(String args[])
 {
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter string ");
  String s1 = sc.nextLine();
    
  String replace=s1.replaceAll("[aeiouAEIOU]"," ");
  System.out.println(replace);  
 }
}

