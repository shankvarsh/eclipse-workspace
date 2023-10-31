package sem2;
import java.util.Scanner;
class cube
{
	private int side;
	cube(int s)
	{
		side=s;
	}
	public boolean equal(cube obj)
	{
		if(side==obj.side)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
public class testpom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner ip=new Scanner(System.in);
System.out.println("enter the side of the first cube");
int a=ip.nextInt();
System.out.println(" enter the side of the second cube");
int b=ip.nextInt();
cube c1=new cube(a);
cube c2=new cube(b);
if(c1.equal(c2))
{
	System.out.println(" c1 is equal to c2");
	
}
else
{
	System.out.println(" c1 is not equal to c2");
}
	}

}
