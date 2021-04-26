class Grades
{
	public static void main(String[] args)
	{
		int marks = 95; char grade = ' ';

		if (marks>90)
		{
			grade = 'A';			
		}

		else if (marks<=90 && marks>80)
		{
			grade = 'B';
		}
		System.out.println(grade);
	}
}