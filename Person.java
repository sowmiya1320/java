package javabasic;

public class Person {
	String name;
	Birthday bday;
	
	public Person(String name,Birthday bday)
	{
		this.name=name;
		this.bday=bday;
	}
	public void printPerson()
	{
		System.out.println(name);
		bday.printBirthday();
	}
}
