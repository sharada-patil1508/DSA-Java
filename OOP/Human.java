package OOP;

import java.util.*;

public class Human {

	int age;
	String name;
	int salary;
	boolean married;
	static long population;
	
	public Human(int age,String name,int salary,boolean married)
	{
		this.age=age; 
		this.name=name; 
		this.salary=salary;
		this.married=married;
		Human.population+=1;  //this.population+=1; 
	}
	
	
	static void fun()
	{
		//imp point
		Main obj=new Main();
		obj.greeting();
		//System.out.println(this.age);//can not use 
	}
	
	
	
}
