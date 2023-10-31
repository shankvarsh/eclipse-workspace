package sem2;
import java.util.Scanner;
class addition
{
	int sum (int a, int b)
	{
		int s;
		s=a+b;
		return s;
	}
	int sum(int a,int b,int c)
	{
		int s;
		s=a+b+c;
		return s;
	}
	float sum(float a, float b)
	{
		float s;
		s=a+b;
		return s;
	}
	float sum(float a, float b, float c)
	{
		float s;
		s=a+b+c;
		return s;
	}
}
public class testmo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner ip=new Scanner(System.in);
System.out.println(" enter 3 integers");
int a=ip.nextInt();
int b=ip.nextInt();
int c=ip.nextInt();
System.out.println(" enter 3 floating point numbers");
float x=ip.nextFloat();
float y=ip.nextFloat();
float z=ip.nextFloat();
addition a1=new addition();
addition a2=new addition();
int p=a1.sum(a, b);
int o=a2.sum(a, b, c);
float q=a1.sum(x,y);
float r=a2.sum(x,y,z);
System.out.println(p+" "+o+" "+q+" "+r);
	}

}
