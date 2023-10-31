package sem2;
import java.util.Scanner;
class quad
{
	int s1,s2,s3,s4;
	quad()
	{
		s1=s2=s3=s4=0;
	}
	quad(int a)
	{
		s1=s2=s3=s4=a;
	}
	quad(int a,int b)
	{
		s1=s2=a;
		s3=s4=b;
	}
	quad(int a,int b, int c, int d)
	{
		s1=a;
		s2=b;
		s3=c;
		s4=d;
	}
	int perimeter()
	{
		int p=s1+s2+s3+s4;
		return p;
	}
	void displayvalues()
	{
		System.out.println(" the sides are "+s1+" "+s2+" "+s3+" "+s4);
	}
}
public class testquad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner ip= new Scanner(System.in);
System.out.println(" enter all the 4 sides");
int a=ip.nextInt();
int b=ip.nextInt();
int c=ip.nextInt();
int d=ip.nextInt();
	quad q1=new quad();
	quad q2=new quad(a);
	quad q3=new quad(a,b);
	quad q4=new quad(a,b,c,d);
	q1.displayvalues();
	int p1=q1.perimeter();
	System.out.println(" perimeter of quad is "+p1);
	q2.displayvalues();
	int p2=q2.perimeter();
	System.out.println(" perimeter of quad is "+p2);
	q3.displayvalues();
	int p3=q3.perimeter();
	System.out.println(" perimeter of quad is "+p3);
	q4.displayvalues();
	int p4=q4.perimeter();
	System.out.println(" perimeter of quad is "+p4);
	}

}
