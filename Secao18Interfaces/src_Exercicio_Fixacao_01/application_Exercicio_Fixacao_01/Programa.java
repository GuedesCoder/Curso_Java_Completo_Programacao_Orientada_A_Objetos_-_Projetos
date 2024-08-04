package application_Exercicio_Fixacao_01;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities_Exercicio_Fixacao_01.Contract;
import entities_Exercicio_Fixacao_01.Installment;
import entities_Services_Exercicio_Fixacao_01.ContractService;
import entities_Services_Exercicio_Fixacao_01.IONlinePaymentService;
import entities_Services_Exercicio_Fixacao_01.PaypalService;

public class Programa {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Enter the contract data:");
		System.out.print("Number: ");
		int number = sc.nextInt();
		System.out.print("Date: ");
		sc.nextLine();
		LocalDate date = LocalDate.parse(sc.nextLine(), fmt);
		System.out.print("Contract value: ");
		double contractValue = sc.nextDouble();
		Contract contract = new Contract(number, date, contractValue);
		
		System.out.print("Enter the quantity od installments: ");
		int quantityInstallments = sc.nextInt();
		
		ContractService contractService = new ContractService(new PaypalService());
		
		contractService.processContract(contract, quantityInstallments);
		
		System.out.println("Installments: ");

		for(Installment installment : contract.getInstallments()) {
			System.out.println(installment);
		}
			
		sc.close();
	}
}
