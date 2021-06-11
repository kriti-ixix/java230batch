interface Mensuration 
{
	//Function declaration
	void calculateArea();
	void calculatePerimeter();
}

public class NewArea
{
	public static void main(String[] args)
	{
		Square square = new Square();
		Rectangle rect = new Rectangle();

		square.calculateArea();
		square.calculatePerimeter();

		rect.calculateArea();
		rect.calculatePerimeter();

	}
}



