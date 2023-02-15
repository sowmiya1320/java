package javabasic;
enum Day
{
	SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY;
	private Day()
	{
		System.out.println("constructor called");
	}
}

public class DemoEnum {

	public static void main(String[] args) {
		
		for(Day day:Day.values())
		{
			System.out.println(day);
		}
		
	}

}
