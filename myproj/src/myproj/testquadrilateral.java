package myproj;
import java.util.Scanner;

class quadrilateral
{
	int s1;
	int s2;
	int s3;
	int s4;

quadrilateral (int a, int b, int c, int d)
{
	s1= a;
	s2=b;
	s3=c;
	s4=d;
	
}
quadrilateral (int a, int b)
{
	s1=a;
	s2=a;
	s3=b;
	s4=b;
}
quadrilateral(int a)
{
	s1=a;
	s2=a;
	s3=a;
	s4=a;
}
void displayvalues()
{System.out.println(s1+" "+s2+" "+s3+" "+s4);
}
}

public class testquadrilateral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner ip=new Scanner(System.in);
int a,b,c,d;
System.out.println("enter a");
a=ip.nextInt();
System.out.println("enter b");
b=ip.nextInt();
System.out.println("enter c");
c=ip.nextInt();
System.out.println("enter d");
d=ip.nextInt();
quadrilateral q2= new quadrilateral(a);
quadrilateral q3= new quadrilateral(a,b);
quadrilateral q4= new quadrilateral(a,b,c,d);
q2.displayvalues();
q3.displayvalues();
q4.displayvalues();
	}

}
