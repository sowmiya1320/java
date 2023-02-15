package javabasic;
import java.util.Locale;
import java.util.Scanner;
import java.text.NumberFormat;

public class CurrencyConvertor {

	public static void main(String[] args) {
		double amount;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your Amount : ");
		amount=sc.nextDouble();
		Locale INDIA=new Locale("en","in");
		String us=NumberFormat.getCurrencyInstance(Locale.US).format(amount);
		String india=NumberFormat.getCurrencyInstance(INDIA).format(amount);
		String korea=NumberFormat.getCurrencyInstance(Locale.KOREA).format(amount);
		String france=NumberFormat.getCurrencyInstance(Locale.FRANCE).format(amount);
		String uk=NumberFormat.getCurrencyInstance(Locale.UK).format(amount);
		System.out.println("US : "+us);
		System.out.println("INDIA :"+india);
		System.out.println("KOREA :"+korea);
		System.out.println("FRANCE :"+france);
		System.out.println("UK :"+uk);
		sc.close();
		
		
	}

}
