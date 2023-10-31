package sem2;
import java.util.*;
public class LinkedListQ1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList<String> list =new LinkedList<String>();
list.add("Red");//Adding object in arraylist  
list.add("Blue");  
list.add("Green");  
list.add("Yellow");  
list.add("Black");

Iterator<String> itr=list.iterator();  
while(itr.hasNext())
{  
	String s=itr.next();
	System.out.println(s);
if(s.length()<5)
{
	itr.remove();
}
}
System.out.println("The modified list is "+list);
}}