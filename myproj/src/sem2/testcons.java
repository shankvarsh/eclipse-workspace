package sem2;
import java.util.Scanner;
class employee
{
	int id;
	String name;
	
	employee(int a, String b)
	{
		id=a;
		name=b;
	}
	void displayvalues()
	{
		System.out.println("id and name is "+id+" "+name);
	}
}
public class testcons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner ip=new Scanner(System.in);
System.out.println("enter id and name");
int a1=ip.nextInt();
String b1=ip.next();
employee e1=new employee(a1,b1);
System.out.println("enter id and name");
int a2=ip.nextInt();
String b2=ip.next();
employee e2=new employee(a2,b2);
e1.displayvalues();
e2.displayvalues();
	}

}
