package pract;
import java.util.*;
public class linkedlistcollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList <String> colorslist=new LinkedList<> ();
	colorslist.add("red");
	colorslist.add("blue");
	colorslist.add("green");
	colorslist.add("yellow");
	colorslist.add("black");
	for (String colorss: colorslist)
	{
		System.out.println(colorss);
	}
	ListIterator<String> it=colorslist.listIterator(colorslist.size());
	while(it.hasPrevious())
	{
		if(it.previous().length()<5)
		{
			it.remove();
		}
		
	}
	System.out.println("New Linked list");
	System.out.println(colorslist);
	}

}
