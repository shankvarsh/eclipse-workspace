package sem2;
import java.util.Scanner;
class student
{
	int roll;
	String name;
	static String college="sfc";
	static int count=0;
	static void change()
	{
		college="sps";
	}
	student()
	{
		count++;
		roll=0;
		name=null;
	}
	student(int a,String b)
	{
		count++;
		roll=a;
		name=b;
	}
	void displayvalues()
	{
		System.out.println(roll+" "+name+" "+college);
	}
	
}
public class teststatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner ip=new Scanner(System.in);
student.change();
System.out.println(" enter the roll and name");
int a=ip.nextInt();
String b=ip.next();
student s1=new student(a,b);

System.out.println(" enter the roll and name");
int c=ip.nextInt();
String d=ip.next();
student s2=new student(c,d);
s1.displayvalues();
s2.displayvalues();
System.out.println("the toatal count is "+student.count);
	}

}
