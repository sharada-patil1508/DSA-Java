package OOP;

public class Student {
	int roll;
	String name;
	float marks;
	
	Student()
	{
		this.roll=46;
		this.name="sharada";
		this.marks=98.0f;
	}
	Student(int roll1,String name,float marks)
	{
		this.roll=roll1;
		this.name=name;
		this.marks=marks;
	}

	public static void main(String[] args) {
		Student std=new Student();
		Student std1=new Student(23,"patil",45.0f);
		System.out.println("roll num is:"+std.roll+"\nname is:"+std.name+"\nmarks is:"+std.marks);
		System.out.println();
		System.out.println("roll num is:"+std1.roll+"\nname is:"+std1.name+"\nmarks is:"+std1.marks);

	}

}
