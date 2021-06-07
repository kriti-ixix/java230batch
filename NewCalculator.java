class NewCalculator //Parent class
{
	int x = 5, y = 10; 

	public static void main(String[] args)
	{
		ChildCalculator object = new ChildCalculator();
		System.out.println(object.x);
		System.out.println(object.y);
		System.out.println(object.z);
	}
}

class ChildCalculator extends NewCalculator //Child class
{
	int z = 20;
}

class OtherCalculator extends NewCalculator //Child class
{

}

class GrandChildCalculator extends ChildCalculator 
{
	int a = 50;	
}