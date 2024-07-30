package application_Secao_9_Exercicio_Fixacao_01;

import java.util.Locale;
import java.util.Scanner;

import entity_Secao_9_Exercicio_Fixacao_01.Account;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Account account;
		
		System.out.print("Emter the account number: ");
		int accountNumber = sc.nextInt();
		System.out.print("Enter the account holder: ");
		sc.nextLine();
		String accountHolder = sc.nextLine();
		System.out.print("Is there an initial deposit? (y/n)");
		char initialDeposit = sc.next().charAt(0);
		if(initialDeposit == 'y') {
			System.out.print("Enter a deposite value: ");
			double amountMoved = sc.nextDouble();
			account = new Account(accountNumber, accountHolder, amountMoved);
		} else {
			account = new Account(accountNumber, accountHolder);
		}
		
		System.out.println();
		
		System.out.println("Account data: ");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double ammountMoved = sc.nextDouble();
		account.deposit(ammountMoved);
		System.out.println("Updated account data:");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		ammountMoved = sc.nextDouble();
		account.withdraw(ammountMoved);	
		System.out.println("Updated account data: ");
		System.out.println(account);
		
		sc.close();
	}

}
