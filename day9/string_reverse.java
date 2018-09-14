import java.util.Scanner;
class ReverseStr
{
 public static void main(String args[])
 {
  Scanner sc = new Scanner(System.in);
  System.out.println("Enterr string tobe reversed");
  String str = sc.nextLine();
  StringBuilder sb = new StringBuilder(str);
  System.out.println(sb.reverse().toString()+" is reversed string");
 }
}