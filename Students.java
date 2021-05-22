class Students
{
	int rollno, marks; String name = ""; float percentage;

	Students(int r, int m, String n) //Parameterised constructor
	{
		this.rollno = r;
		this.marks = m;
		this.name = n;
	}

	void calPercentage()
	{
		this.percentage = this.marks*100 / 50; 
	}

	public static void main(String[] args) 
	{
		Students student1 = new Students(5, 40, "ABC");
		//student1.rollno = 5;
		//student1.marks = 40;
		//student1.name = "ABC";
		student1.calPercentage();

		System.out.println(student1.name);
		System.out.println(student1.marks);
		System.out.println(student1.percentage);

		Students student2 = new Students(10, 45, "XYZ");
		//student2.rollno = 6;
		//student2.marks = 45;
		//student2.name = "XYZ";
		student2.calPercentage();
	}
}
