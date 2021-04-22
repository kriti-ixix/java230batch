class Bike
{
	int speed = 100, gear = 1;
	
	int speedUp()
	{
		speed += 10;
		return speed;
	}

	public static void main(String[] args)
	{
		Bike bike = new Bike();
		int x = bike.speedUp();
		System.out.println(x);
	}
}