package pract;
import java.util.*;
public class hashmapc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap <String,Integer> stu=new HashMap<>();
		stu.put("Jay", 89);
		stu.put("Jaya", 79);
		stu.put("Jayan", 56);
		stu.put("Ayan", 95);
		stu.put("Joy", 81);
		Set<Map.Entry<String,Integer>> entryy=stu.entrySet();
		System.out.println("Print student details: ");
		Iterator <Map.Entry<String, Integer>> it=entryy.iterator();
		while(it.hasNext())
		{
			Map.Entry<String,Integer> entry=it.next();
			String studentname =entry.getKey();
			int stum=entry.getValue();
			System.out.println(studentname+":"+stum);
		}
	}

}