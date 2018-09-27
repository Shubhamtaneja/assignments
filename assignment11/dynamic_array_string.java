import java.util.Scanner;
import java.util.Arrays;
class DynamicStr
{
 static String s[]=new String[2];
 int j=0;
 void add(String str)
 {
  if(j<s.length)
  {
  s[j]=str;
  j++;
 }
 else
 {
  String s2[]=new String[j+1];
  for(int k=0;k<s.length;k++)
  {
   s2[k]=s[k];
  }
  s=s2;
  s[j]=str;
  j++;
 }
 }
 public void display()
 {
 System.out.println("Display--------------------------------");
 for(int i=0;i<s.length;i++)
 {
  System.out.println(s[i]+" ");
 }
 }
 
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  DynamicStr st= new DynamicStr();
  for(int i=0;i<5;i++)
  {
   String str=sc.nextLine();
   st.add(str);
  }
  st.display();
 // st.sort();
  st.display();
 }
}