package OOP;

public class Encapsulation_ex {
	
	String name;
	int age;
	
	public String getname()
	{
		return name;
	}
	
	public void setname(String name)
	{
		this.name=name;
	}

	public static void main(String[] args) {
		
		Encapsulation_ex p=new Encapsulation_ex();
		
		p.setname("sharada");
		System.out.println("name is:"+p.getname());
		

	}

}
