package javabasic;

public class SampleOne {
	private String FirstName;
	private String LastName;
	private static int total;
	
	public SampleOne(String fname,String lname)
	{
		FirstName=fname;
		LastName=lname;
		total+=1;
		System.out.println("Total Singers: "+total);
	}
	public String getFirstName()
	{
		return FirstName;
	}
	public String getLastName()
	{
		return LastName;
	}
	public static int getTotal()
	{
		return total;
	}

	public static void main(String[] args) {
		
		SampleOne sampleone1=new SampleOne("Kim","Namjoon");
		SampleOne sampleone2=new SampleOne("Kim","Seokjin");
		SampleOne sampleone3=new SampleOne("min","youngi");
		SampleOne sampleone4=new SampleOne("jung","hoseok");
		SampleOne sampleone5=new SampleOne("park","jimin");
		SampleOne sampleone6=new SampleOne("Kim","taehyung");
		SampleOne sampleone7=new SampleOne("jeon","jungkook");
		
		
		System.out.println(sampleone1.FirstName);
		System.out.println(sampleone1.LastName);
		System.out.println(SampleOne.total);

	}

}
