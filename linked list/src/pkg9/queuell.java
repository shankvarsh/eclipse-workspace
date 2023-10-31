package pkg9;
import java.util.*;

class nodes 
{ 
	int data; 
	nodes next; 
	public nodes(int x) 
		{ 
			data=x; 
		} 
} 
class lqueue 
{ 
	nodes front,rear; 
	public lqueue() 
	{ 
		front=rear=null; 
    } 
	public void insert(int x) 
	{ 
		nodes temp=new nodes(x); 
		nodes current=rear; 
    if(rear!=null)
    	{ 
    		current.next=temp; 
    		rear=temp;
    	} 
    else 
    	{ 
    		front=temp; 
    		rear=temp; 
    	} 
    	temp.next=null; 
	} 
	public void remove() 
	{ 
		nodes current=front; 
		if(front==null) 
		{ 
			System.out.println("Queue Empty - Cannot Remove"); 	
			return; 
		} 
		if(current.next!=null) 
		rear=current.next; 
		front=current.next; 
		System.out.println(current.data+ " Removed "); 
		return; 
	} 
	public void displist() 
	{ 
		nodes current=front; 
		if(front==null) 
			{ 
				System.out.println("Queue Empty"); 
				return; 
			} 
		System.out.println("Front->"); 
		while(current.next!=null) 
			{ 
				System.out.println(current.data+"->"); 
				current=current.next; 
			} 
		if(current.next==null) 
			{ 
				System.out.println(current.data); 
			} 
	} 
} 
public class queuell {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ip=new Scanner(System.in); 
		lqueue lq=new lqueue(); 
		int ele,ch; 
		do 
		 { 
		      System.out.println("\n Linked Queue Menu"); 
		      System.out.println("1.Insert"); 
		      System.out.println("2.Remove"); 
		      System.out.println("3.Display"); 
		      System.out.println("4.Exit"); 
		      System.out.println("\n Enter Choice:"); 
		ch = ip.nextInt(); 
		switch (ch) 
		      { 
		case 1: 
			System.out.println("Enter Element to Insert"); 
			ele = ip.nextInt(); 
			lq.insert(ele); 
		break; 
		case 2: 
			lq.remove(); 
		break; 
		case 3: 
		    System.out.println("Linked Queue Elements:"); 
		    lq.displist(); 
		break; 
		      } 
		  } 
		while (ch>=1 &&ch<= 3); 
	}

}
