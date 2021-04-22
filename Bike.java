/*
Functions are of two types based on input:
    - Default
    - Parameterised 
    
Based on return type:
    - No return
    - Some value is returned
*/

class Bike
{
	int speed = 100, gear = 1;
	
	int speedUp() //Default function
	{
		speed += 10;
		return speed;
	}

	int gearUp(int a) //Parameterised function
	{
		gear += a;
		return gear;
	}

	public static void main(String[] args)
	{
		Bike bike = new Bike();
		int x = bike.speedUp();
		System.out.println(x);

		int y = bike.gearUp(5);
		System.out.println(y);
	}
}