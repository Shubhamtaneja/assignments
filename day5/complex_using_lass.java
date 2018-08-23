import java.util.Scanner;
class Complex {
	
    public double  real;
    public double imag;

    public Complex(double real,double imag) {
        this.real = real;
        this.imag = imag;
    }

    public static void main(String args[])
	{
	    double a,b,c,d;
	    System.out.println("Enter 2 value for first part");
		Scanner sc= new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("Enter 2 value for other part");
		c=sc.nextInt();
		d=sc.nextInt();
        Complex n1 = new Complex(a,b);
        Complex n2 = new Complex(c,d);
        Complex temp;

        temp = add(n1, n2);

        System.out.println("Sum of real no is = "+temp.real);
		System.out.println("Sum of imag no is = "+temp.imag+"i");
    }

    public static Complex add(Complex n1, Complex n2)
    {
        Complex temp = new Complex(0, 0);

        temp.real = n1.real + n2.real;
        temp.imag = n1.imag + n2.imag;

        return(temp);
    }
}