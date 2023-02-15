package javabasic;

public class Birthday {
	
		int date;
		int month;
		int year;
		public Birthday(int date,int month,int year)
		{
			this.date=date;
			this.month=month;
			this.year=year;
		}

	public void printBirthday()
	{
		System.out.println(date+"/"+month+"/"+year);
	}

}
