class Parent 
{
	Parent()
	{
		System.out.println("In default constructor of parent class");
	}
	Parent(int p)
	{
		this();
		
	}	
	public static void main (String args[])
	{
		int p=10;
		new Parent(p);
	}
}
