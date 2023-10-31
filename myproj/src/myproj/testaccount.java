package myproj;


class account
{
	String name;
	int no;
	int balance;
	int amount;
	
	void setvalues(String m, int n , int b)
	{
		name= m;
		no=n;
		balance=b;
	}
	void displayvalues()
	{
		System.out.println("name"+name);
		System.out.println("no"+no);
		System.out.println("balance"+balance);
	}
	int withdraw()
	{
		balance= balance-amount;
		return balance;
		
	}
	int deposit()
			{
		balance= balance+amount;
		return balance;
			}
	
}

public class testaccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		account a1= new account();
		a1.setvalues(" b",123,5000);
		a1.displayvalues();
		a1.withdraw();
		a1.deposit();
	}

}
