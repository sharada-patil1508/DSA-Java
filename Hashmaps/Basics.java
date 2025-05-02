package Hashmaps;
import java.util.*;
public class Basics {

	public static void main(String[] args) {
		HashMap<String ,Integer> map=new HashMap<>();
		map.put("kunal", 89);
		map.put("sharada", 99);
		map.put("patil", 100);
		System.out.println(map.get("kunal"));
		System.out.println(map.getOrDefault("abc",9));
		
		
		//set will not display duplicate elements
		HashSet<Integer> set=new HashSet<>();
		//HashSet<Integer> set=new TreeMap<>();
		set.add(56);
		set.add(9);
		set.add(7);
		set.add(7);
		System.out.println(set);

	}
	
	

}
