package sem2;
import java.util.Scanner;
class stu
{
	int roll;
	String name;
	
	void setvalues(int r, String n)
	{
		roll=r;
		name=n;
	}
	void dispalyvalues()
	{
		System.out.println("roll no. is "+roll+" name is "+name);
	}
}
public class teststu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ip=new Scanner(System.in);
	System.out.println("enter rollno and name");
	int a1=ip.nextInt();
	String b1=ip.next();
stu s1=new stu();
s1.setvalues(a1,b1);

System.out.println("enter rollno and name");
int a2=ip.nextInt();
String b2=ip.next();
stu s2= new stu();
s2.setvalues(a2,b2);
s1.dispalyvalues();
s2.dispalyvalues();
	}

}
