package Baisc_prgms;

public class Vowel_in_str {

	public static void main(String[] args) {
		String str="BNMT";
		int i=0;
		boolean flag=false;
		while(i<str.length())
		{
			char s=str.charAt(i);
			if(s=='I') {
				System.out.println("yes");
				flag=true;
				break;
			}
			i++;
		}
		if(!flag)
		{
			System.out.println("not");
		}
		

	}

}
