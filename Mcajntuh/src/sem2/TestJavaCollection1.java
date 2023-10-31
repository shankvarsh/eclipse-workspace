package sem2;

import java.util.*;  
class TestJavaCollection1{  
public static void main(String args[]){  
ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
list.add("Red");//Adding object in arraylist  
list.add("Blue");  
list.add("Green");  
list.add("Yellow");  
list.add("Black");
//Traversing list through Iterator  
Iterator itr=list.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}  
}  
}  