package Baisc_prgms;

public class Reverse_str {

	public static void main(String[] args) {

		String str="hello";
		String ans="";
		for(int i=str.length()-1;i>=0;i--)
		{
			ans+=str.charAt(i);
		}
		System.out.println(ans);
		
		
	}

}

	
