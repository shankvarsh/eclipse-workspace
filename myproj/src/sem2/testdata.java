package sem2;
import java.util.Scanner;

public class testdata {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner ip=new Scanner(System.in);
String name, adr;
int age;
float per;
char gender='f';
boolean p;

System.out.println("enter address");
adr=ip.nextLine();
System.out.println("enter name");
name=ip.next();
System.out.println("enter age");
age=ip.nextInt();
System.out.println("enter percentage");
per=ip.nextFloat();
System.out.println("enter gender");
gender=ip.next().charAt(0);
System.out.println("enter true or false");
p=ip.nextBoolean();
System.out.println(name+" "+adr+" "+age+" "+per+" "+gender+" "+p);	
	}
}
