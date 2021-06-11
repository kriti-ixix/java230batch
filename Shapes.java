class Square implements Mensuration 
{
	int side = 5;

	public void calculateArea()
	{
		System.out.println("Square area is called");
	}

	public void calculatePerimeter()
	{
		System.out.println("Square perimeter is called");
	}
}

class Rectangle implements Mensuration
{
	int length = 50, breadth = 100;

	public void calculateArea()
	{
		System.out.println("Rectangle area is called");
	}

	public void calculatePerimeter()
	{
		System.out.println("Rectangle perimeter is called"); 
	}
	
}