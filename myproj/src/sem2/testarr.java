package sem2;
import java.util.Scanner;
class eee
{
	int idnum;
	String name;
	eee(int id,String n)
	{
		idnum=id;
		name=n;
	}
}
public class testarr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner ip=new Scanner(System.in);
int id,i;
String n;
eee[]arr;
System.out.println(" enter the size of the array");
int m=ip.nextInt();
arr=new eee[m];
for (i=0; i<m;i++)
{
System.out.println("enter id and name");
id=ip.nextInt();
n=ip.next();
arr[i]=new eee(id,n);
}
for(i=0; i<m;i++)
{
	System.out.println("element at index "+i+" :"+arr[i].idnum+" "+arr[i].name);
	
}
	}

}
