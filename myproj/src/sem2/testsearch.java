package sem2;
import java.util.Scanner;
public class testsearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner ip=new Scanner(System.in);
int i,n,e;
int flag=0;
System.out.println(" enter the size of the array");
n=ip.nextInt();
int arr[]=new int[n];
System.out.println("enter the elements");
for(i=0;i<n;i++)
{
	arr[i]=ip.nextInt();
}
System.out.println("enter the element to be searched");
e=ip.nextInt();
for (i=0;i<n;i++)
{
	if(e==arr[i])
	{
		flag=1;
	}
}
if (flag==1)
{
	System.out.println("element is found");
}
else
{
	System.out.println("element is not found");
}
	}

}
