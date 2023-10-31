package sem2;
import java.util.Scanner;
class candidate
{
	private int roll=13;
	public String name;
	static String college="sfc";
candidate(int r, String n)
{
	roll=r;
	name=n;
}
void displayvalues()
{
	System.out.println(roll+" "+name+" "+college);
}
}
public class testpp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner ip= new Scanner(System.in);
System.out.println(" enter roll and name");
int a1=ip.nextInt();
String b1=ip.next();
candidate c1=new candidate (a1,b1);
c1.displayvalues();
System.out.println(" enter roll and name");
int a2=ip.nextInt();
String b2=ip.next();
candidate c2=new candidate (a2,b2);
c2.displayvalues();
	}

}
