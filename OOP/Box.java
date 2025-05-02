package OOP;

public class Box {
	public int l;
	public int w;
	public int h;
	public int side;
	
	
	Box()
	{
		super();
		this.l=-1;
		this.w=-1;
		this.h=-1;
	}
	
	Box(int l,int w,int h)
	{
		
		this.l=l;
		this.w=w;
		this.h=h;
	}
	
	Box(Box old)
	{
		this.l=old.l;
		this.w=old.w;
		this.h=old.h;
		 this.side = old.side; 
	}
	
	Box(int side)
	{
		this.side=side;
	}

}
class Boxweight extends Box
{
	public int weight;
	Boxweight()
	{
		
	}
	Boxweight(Boxweight other)
	{
		super(other);
		weight=other.weight;
	}
	
	Boxweight(int l,int w,int h,int weight)
	{
		
		super(l,w,h);
		System.out.println(super.side);
		this.weight=weight;
	}
	
	Boxweight(int side,int weight)
	{
		
		super(side);
		this.weight=weight;
	}
	
	
	
}
class Boxcolor extends Boxweight
{
	int r=0;
	int y=0;
	Boxcolor()
	{
		
	}
	Boxcolor(int l,int w,int r,int y)
	{
		super(l,w);
		this.r=r;
		this.y=y;
		
	}
}
