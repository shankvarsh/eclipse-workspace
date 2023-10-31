package sem2;
import java.util.Scanner;

class circlee
{
	int r;
	void setvalues(int b)
	{
		r=b;
	}
	void displayvalues()
	{
		System.out.println("radius= "+r);
		
	}
	void area()
	{
		double a;
		a=3.14*r*r;
		System.out.println("Area = "+a);
	}
 }
public class circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ip=new Scanner(System.in);
circlee c1 =new circlee();
c1.setvalues(5);
c1.displayvalues();
c1.area();
	}

}
