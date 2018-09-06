class Parent 
{
	Parent()
	{
		check();
	}
	public void check()
	{
		System.out.println("Parent class");
	}	
}
class Child extends Parent
{
	Child()
	{
	super();
	}
	public static void main(String args[])
	{
		new Child();
	}
}