package Strings;
import java.util.*;
import java.util.*;
public class Longest_pln_str {
	
	public static List<List<String>> fun(String[] strs)
	{
		List<List<String>> list1 = new ArrayList<>();
		
		boolean[] vis=new boolean[strs.length];

		for(int i=0;i<strs.length;i++)
		{
			if(vis[i])
			{
				continue;
			}
			List<String> list2=new ArrayList<>();
			String s=strs[i];
			list2.add(s);
			vis[i]=true;
			
			if (s.equals("")) {
				for (int j = i + 1; j < strs.length; j++) {
					if (strs[j].equals("")) {
						list2.add(strs[j]);
						vis[j] = true;
					}
				}
				list1.add(list2);
				continue; // Move to the next word
			}
			
			
			for(int j=i+1;j<strs.length-1;j++)
			{
				String s2=strs[j];
				boolean ans=haveSameCharacterFrequency( s, s2); 
				
				if(ans)
				{
					list2.add(s2);
					vis[j]=true;
				}
						
			}
			list1.add(list2);
			
		}
		
		return list1;
	}
	
	public static boolean haveSameCharacterFrequency(String str1, String str2) {
        if (str1.length() != str2.length()) return false;

        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : str1.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c : str2.toCharArray()) {
            if (!map.containsKey(c) || map.get(c) == 0) return false;
            map.put(c, map.get(c) - 1);
        }

        return true;
    }

	
	
	public static void main(String[] args) {
		String[] strs= {"eat","tea","tan","ate","nat","bat"};
		
		List<List<String>> ans=fun(strs);
		System.out.println(ans);
		
		

	}
	
	

}
