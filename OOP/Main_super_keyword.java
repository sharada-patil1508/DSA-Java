
package OOP;

class Main_super_keyword {  
    int a = 10;
    static int b = 20;

    
    Main_super_keyword(int x, int y) {
        this.a = x;
        b = y;  
    }
    
    void msg()
    {
    	System.out.println("this is person call");
    }
    
    Main_super_keyword()
    {
    	System.out.println("hiii..");
    }
    
}

class Base extends Main_super_keyword {  
	int c;
    Base(int r) {
       
        super(30, 40); 
        this.c=r;
    }

    public void fun() {
    	
        System.out.println("Sum: " + (a + b+c)); 
    }
    
    
    //use of super keyword in methods
    void msg()
    {
    	System.out.println("this is child class call");
    }
    void display() {
    //invoke call to current msg method
    	msg();
    	
    	//invoke to call to parent class msg method
    	super.msg();
    }
    
    Base()
    {
    	//invoke or call parent class constroctor
    	super();
    	
    	System.out.println("hello");
    }
    
}