package OOP;

public class Triangle {
	private int length,width,height;
	//default consrutor
	Triangle()
	{
		length=3;
		width=4;
		height=5;
	}
	//parameterized constructor
	Triangle(int l,int w,int h)
	{
		length=l;
		width=w;
		height=h;
	}
	int area()
	{
		return length*width*height;
	}
	int perimeter()
	{
		return length+width+height;
	}

}
