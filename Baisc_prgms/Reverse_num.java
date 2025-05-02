package Baisc_prgms;

public class Reverse_num {

	public static void main(String[] args) {
		int num=12345;
		int count=0;
		/*int rev=0;
		int count=0;
		while(num!=0)
		{
			int x=num%10;
			rev=rev*10+x;
			num=num/10;
		}*/
		
		while(num!=0)
		{
			 num=num/10;
			count=count+1;
		}
	//	System.out.println(rev);
		System.out.println(count);
	}

}
