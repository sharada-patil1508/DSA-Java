package Strings;

public class Rev2 {
	
	public static String fun(String str)
	{
		String ans="";
		for(int i=str.length()-1;i>=0;i--)
		{
			ans+=str.charAt(i);
		}
		return ans;
	}

	public static void main(String[] args) {
		String str="sharda";
		String ans=fun(str);
		System.out.println(ans);

	}

}
