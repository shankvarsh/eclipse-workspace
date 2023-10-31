package pract;
import java.util.Scanner;
public class maxx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter 3 numbers");
int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
System.out.println(max.maximum(a,b,c)+"Is the max of all the three!");
System.out.println(max.maximum(a,b)+"Is the max of"+a+"&"+b);
System.out.println(max.maximum(a,c)+"Is the max of"+a+"&"+c);
System.out.println(max.maximum(c,b)+"Is the max of"+b+"&"+c);
	}
}

class max{
	static int maximum(int a, int b) {
		int max=a>b?a:b;
		return max;
	}
	static int maximum(int a,int b, int c) {
		int max=a>b&&a>c?a:b>a&&b>c?b:c;
		return max;
	}
}