package Hashmaps;
import java.util.*;
public class Hash_final {
	
	public class HashMapFinal<k,v>
	{
		ArrayList<LinkedList<Entity>> list;
	}
	
	private int size=0;
	private float lf=0.5f;
	
	/*public Hash_final()
	{
		list=new ArrayList<>();
		for(int i=0;i<10;i++)
		{
			list.add(new LinkedList<>());
		}
	}
	
	public void put(k key,v value)
	{
		int hash=Math.abs(key.hashCode()%list.size);
	}*/

	private class Entity
	{
		String key;
		String value;
		
		public Entity(String key,String value)
		{
			this.key=key;
			this.value=value;
		}
		
	}
	public static void main(String[] args) {
		
	}

}
