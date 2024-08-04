package application_Exercicio_Resolvido_01;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities_Exercicio_Resolvido_01.CarRental;
import entities_Exercicio_Resolvido_01.Vehicle;
import model_services_Exercicio_Resolvido_01.BrazilTaxService;
import model_services_Exercicio_Resolvido_01.RentalService;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		System.out.println("Entre com os dados do aluguel.");
		System.out.print("Modelo do carro: ");
		String carModel = sc.nextLine();
		System.out.print("Retirada (dd/MM/yyyy hh:mm): ");
		LocalDateTime request = LocalDateTime.parse(sc.nextLine(), fmt);
		System.out.print("Retorno (dd/MM/yyyy hh:mm): ");
		LocalDateTime returned = LocalDateTime.parse(sc.nextLine(), fmt);
		
		CarRental carRental = new CarRental(request, returned, new Vehicle(carModel));
		
		System.out.print("Entre com o preço por hora: ");
		double pricePerHour = sc.nextDouble();
		System.out.print("Entre com o preço por dia: ");
		double pricePerDay = sc.nextDouble();
		
		RentalService rental = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService());
		
		rental.processInvoice(carRental);
		System.out.println("FATURA:");
		System.out.println("Pagamento básico: " + String.format("%.2f", carRental.getInvoice().getBasicPayment()));
		System.out.println("Imposto: " + String.format("%.2f", carRental.getInvoice().getTax()));
		System.out.println("Pagamento total: " + String.format("%.2f", carRental.getInvoice().getTotalPayment()));
		
		
		
		
		sc.close();
	}

}
