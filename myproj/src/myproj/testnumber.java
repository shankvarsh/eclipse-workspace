package myproj;

import java.util.Scanner;

class number
{
	int n1;
	int n2;
	int n3;

number (int a, int b, int c)
{
	n1= a;
	n2=b;
	n3=c;
	
}
number (int a, int b)
{
	n1=a;
	n2=b;
	n3=0;
}
number(int a)
{
	n1=a;
	n2=0;
	n3=0;
}
number()
{
	n1=0;
	n2=0;
	n3=0;
}
void sum()
{
	int s;
	s=n1+n2+n3;
	System.out.println(+s);
	
}
void displayvalues()
{System.out.println(n1+" "+n2+" "+n3);
}
}
public class testnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ip=new Scanner(System.in);
		int a,b,c;
		System.out.println("enter a");
		a=ip.nextInt();
		System.out.println("enter b");
		b=ip.nextInt();
		System.out.println("enter c");
		c=ip.nextInt();
		number n1= new number();
		number n2= new number(a);
		number n3= new number(a,b);
		number n4= new number(a,b,c);
		n1.displayvalues();
		n2.displayvalues();
		n3.displayvalues();
		n4.displayvalues();
		n1.sum();
		n2.sum();
		n3.sum();
		n4.sum();
	}

}
