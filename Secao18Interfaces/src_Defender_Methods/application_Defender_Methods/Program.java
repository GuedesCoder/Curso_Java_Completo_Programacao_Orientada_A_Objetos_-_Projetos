package application_Defender_Methods;

import java.util.Locale;
import java.util.Scanner;

import services_Defender_Methods.BrazilInterestService;
import services_Defender_Methods.IInterestService;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Amount: ");
		double amount = sc.nextDouble();
		System.out.print("Months: ");
		int months = sc.nextInt();
		
		IInterestService uis = new BrazilInterestService(30.0);
		double payment = uis.payment(amount, months);
		
		System.out.println("Payment after " + months + " months: BRL " + String.format("%.2f", payment));
		sc.close();
	}

}
