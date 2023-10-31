package pract;
import java.util.Scanner;
public class Fib {
static void non(int n){
	int a=0,b=1,c=0;
	for (int i=0;i<n;i++)
	{
		a=b;
		b=c;
		c=a+b;
	}
	System.out.println(c);
}
static int rec(int n){
	if(n==1||n==2)
	{
		return 1;
	}
	return rec(n-1)+rec(n-2);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the index of the fib sequence: ");
		int n=sc.nextInt();
		System.out.println("For non-recursive: ");
		non(n);
		System.out.println("For recursive: "+rec(n));
		
		sc.close();
	}

}
