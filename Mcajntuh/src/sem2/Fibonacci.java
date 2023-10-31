package sem2;
import java.util.*;
public class Fibonacci {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,choice;
        Scanner ip=new Scanner(System.in);
        System.out.println("Enter Number:");
        n=ip.nextInt();
        while(n>=0) {
        System.out.println("1.With recurison \n2.Without Recursion ");
        System.out.println("Enter Choice:");
        choice=ip.nextInt();
        switch(choice)
         {
           case 1:System.out.println("series generated  "+n+ " using recurison is " );
                  recursion(n);
                  break;
           case 2:System.out.println("series generated "+n+ " without recurison is ");
                  withoutrecursion(n);
                  break; 
           default:System.out.println("Wrong choice");
                  break;
         }
        }
	}


static void withoutrecursion(int n)
{
	int x=0,y=1,z=0,i;
	for(i=1;i<=n;i++) 
	{
		System.out.println(z);
		x=y;
		y=z;
		z=x+y;
		
	}
	
	
}
static int x=0,y=1,z=0;
static void recursion(int n)
{
	
	if(n>0)
	{
		System.out.println(z);
		x=y;
		y=z;
		z=x+y;
		recursion(n-1);
		
	}
	}

}
