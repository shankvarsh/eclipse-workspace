package pkg9;

import java.util.Scanner;

class node 
{ 
	int data; 
	node next; 
	public node (int x) //parameterized  
		{ 
			data=x; 
		} 
} 

class singlelink //user defined class 
{     
	node head;
	int  listcount; 
	public singlelink()  //constructor 
		{ 
			head=null;  //instant variable and initialize to null 
			listcount=0; 
		} 
	public void addfirst(int x) 
		{ 
			node temp=new node(x); 
			temp.next=head; // head =null  
			head=temp; 
			listcount++;         
		} 
	public void addend(int x) 
		{     
			node temp=new node(x); 
			node current=head; 
			while(current.next!=null) 
			  { 
				current=current.next; 
			  } 
			current.next=temp; 
			temp.next=null; 
			listcount++; 
		} 
	public void addafter(int x,int se) 
		{ 
			node temp=new node(x); 
			node current=head; 
			if(head==null) 
			  { 
			     System.out.println("List empty-cannot search for "+se); 
			     return; 
			  } 
			while(current.data!=se) 
			  { 
				current=current.next; 
				if(current==null) 
					{ 
						System.out.println(se+" is not found-insertion"); 
						return; 
					} 
			  } 
			temp.next=current.next; 
			current.next=temp; 
			listcount++; 
		} 
	public void remove(int se) 
		{ 
			node current=head; 
			node prev=null; 
			if(head==null) 
			  { 
				System.out.println("List empty-cannot remove " +se); 
				return; 
			  } 
			while(current.data!=se) 
			  { 
				if(current.next==null) 
					{ 
						System.out.println(se +" Not found "); 
					} 
					prev=current; 
					current=current.next; 
			  } 
			if(prev==null) 
			head=current.next; 
			else 
			prev.next=current.next; 
			System.out.println(se +"Deleted "); 
			return; 
		} 
	public void displist() 
		{ 
			node current=head; 
			if(head==null) 
			  { 
			     System.out.println("List empty "); 
			     return; 
			  } 
			  System.out.println(" head-> "); 
			  while(current.next!=null) 
			  	{ 
				  	System.out.println(current.data +"->"); 
				  	current=current.next; 
			  	} 
			  if(current.next==null) 
			System.out.println(current.data); 
		} 
}

public class linkedlist 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner ip=new Scanner(System.in); 
		singlelink obj=new singlelink(); 
		int ele,ch,pos; 
		do 
		{ 
		    System.out.println("Linked List Menu "); 
		    System.out.println("1.Insert "); 
		    System.out.println("2.Remove "); 
		    System.out.println("3.Display "); 
		    System.out.println("4.Exit "); 
		    System.out.println("\n Enter choice: "); 
		    ch=ip.nextInt(); 
		switch(ch) 
			{ 
		case 1: 
			System.out.println("Enter element to insert"); 
			ele=ip.nextInt(); 
			System.out.println("Enter position to insert \n at beginning-1 \n after an element-2 \n at end-3 "); 
			pos=ip.nextInt(); 
		switch(pos) 
			{ 
		case 1: 
			obj.addfirst(ele); 
			break; 
		case 2: 
			System.out.println("Insert after which element"); 
			int se=ip.nextInt(); 
			obj.addafter(ele, se); 
			break; 
		case 3: 
			obj.addend(ele); 
			break; 
		default: 
			System.out.println("Invalid option-insertion aborted "); 
			} 
		break; 
		case 2: 
			System.out.println("Enter element to delete "); 
			ele=ip.nextInt(); 
			obj.remove(ele); 
		break; 
		case 3: 
			System.out.println("Linked list elements "); 
			obj.displist(); 
		break; 
			} 
		} 
		while(ch>=1 &&ch<=3); 
	} 
} 
			
	
