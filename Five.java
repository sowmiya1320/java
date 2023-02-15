package javabasic;

public class Five extends Thread {
	public void FiveTable()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(i+"*5="+(i*5));
			try
			{
				sleep(1000);
			}
			catch(InterruptedException e) {}
		}
	}

}
