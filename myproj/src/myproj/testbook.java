package myproj;
import java.util.Scanner;

class book
{
	String title;
	int pages;
	int price;
	int quantity;
	
	book(String t, int n, int p, int q)
	{
		title= t;
		pages=n;
		price=p;
		quantity=q;
	}
	int issue()
	{
		quantity= quantity-1;
		return quantity;
		
	}
	int returnn()
			{
		quantity= quantity+1;
		return quantity;
			}
	
}

public class testbook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner ip=new Scanner(System.in);
String t;
int n,p,q;
System.out.println("enter the values");
t=ip.next();
n=ip.nextInt();
p=ip.nextInt();
q=ip.nextInt();
book b1= new book(t,n,p,q);
q=b1.returnn();
System.out.println("books remaining are "+q);
q=b1.issue();
System.out.println("books left are "+q);

	}

}
