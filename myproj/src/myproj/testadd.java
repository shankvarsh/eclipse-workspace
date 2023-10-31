 package myproj;

import java.util.Scanner;

class addition
{
int sum(int a, int b)
{
	int s;
	s=a+b;
	return s;
	
}
int sum (int a, int b, int c)
{
	int s;
	s=a+b+c;
	return s;
}
double sum (double a, double b)
{
	double s;
	s= a+b;
	return s;
}
double sum (double a, double b, double c)
{
	double s;
	s= a+b+c;
	return s;
}
}
public class testadd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int s1;
double s2;
addition a1= new addition();
addition a2= new addition();
addition a3= new addition();
addition a4= new addition();
s1= a1.sum(2,4);
System.out.println(s1);
s1= a2.sum(2,4,3);
System.out.println(s1);
s2= a3.sum(1.1,2.1);
System.out.println(s2);
s2= a4.sum(2.9,9.8,4.1);
System.out.println(s2);

	}

}
