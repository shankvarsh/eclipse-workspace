package pract;
import java.util.Scanner;
public class prime {
public static void p(int n) {
	for(int i=1;i<n;i++)
	{
		int count =0;
		for(int j=1;j<n;j++)
{
	if(i%j==0)
	{
		count ++;
}
}
	
	if(count==2)
	{
	System.out.println(""+i); 	
	}
}}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter till which number: ");
		int n=sc.nextInt();
		System.out.println("the prime numbers are");
		p(n);
	}

}
