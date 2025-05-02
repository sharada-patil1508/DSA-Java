package Inheritance;

public class Boxweight extends Box{
	double weight;
	Boxweight()
	{
		this.weight=-1;
	}
	Boxweight(Boxweight other)
	{
		super(other);
		weight=other.weight;
	}

}
