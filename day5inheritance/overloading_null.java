class Overloadprint
{
 void print()
 {
  System.out.println("function with null argument");
 }
 void print(int i)
 {
  System.out.println("integer function");
 }
 void print(float i)
 {
  System.out.println("Float function");
 }
 void print(int i,float j)
 {
  System.out.println("both int and float");
 }
}

class display
{
 public static void main(String args[])
 {
 Overloadprint obj=new Overloadprint();
 obj.print();
 obj.print(10);
 obj.print(0.10f);
 obj.print(100,0.100f);
 }
}