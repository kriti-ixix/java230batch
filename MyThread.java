class MyThread extends Thread
{
	public void run()
	{
		for (int i = 0; i < 10; i++)
		{
			try 
			{
				System.out.println(i);
				Thread.sleep(1000);
			}

			catch (Exception e)
			{
				e.printStackTrace();
			}
			
		}
	}

	public static void main(String[] args)
	{
		MyThread t1 = new MyThread();
		OtherThread t2 = new OtherThread();

		t1.start();
		t2.start();
	}

}

class OtherThread extends Thread
{
	public void run()
	{
		for (int i = 10; i < 100; i+=10)
		{
			try 
			{
				System.out.println(i);
				Thread.sleep(1000);
			}

			catch (Exception e)
			{
				e.printStackTrace();
			}
			
		}
	}
}