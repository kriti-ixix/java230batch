class BankData 
{
	String customerName = "";
	int accId, rate = 5, time;
	double principal, amount;

	void getSimpleInterest()
	{
		double simpleInt = (this.principal * rate * this.time) / 100;
		this.amount = this.principal + simpleInt; 
	}

	public static void main(String[] args)
	{
		
	}
}