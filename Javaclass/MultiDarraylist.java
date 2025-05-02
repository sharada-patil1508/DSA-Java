package Javaclass;
import java.util.*;

public class MultiDarraylist {

	public static void main(String[] args) {
		
		ArrayList<ArrayList<Integer>> list=new ArrayList<ArrayList<Integer>>();
		
		list.add(new ArrayList<Integer>());//empty space allocate in list
		System.out.println(list);
		
		
		  // Adding 5 to R0 created above list(R0, C0)
		list.get(0).add(0,5);
		System.out.println(list);
		
		list.get(0).add(1,23);
		System.out.println(list);
		
		list.get(0).add(2,25);
		System.out.println(list);
		
		//add new list inside a list
		list.add(new ArrayList<Integer>());
		
		list.get(1).add(0,25);
		System.out.println(list);
		
		//to remove
		list.remove(1).add(0,25);
		System.out.println(list);
		
		ArrayList<ArrayList<String>>   str=new ArrayList<ArrayList<String>>();
		
		str.add(new ArrayList<String>(Arrays.asList("sharada", "patil")));
		System.out.println(str);
		
		str.add(new ArrayList<String>(Arrays.asList("bengaluru", "bnmit")));
		System.out.println(str);
		
		str.get(1).set(1, "test");
		System.out.println(str);
		
		str.remove(0);
		System.out.println(str);
		
		
		
		
		
		
		
	}

}
