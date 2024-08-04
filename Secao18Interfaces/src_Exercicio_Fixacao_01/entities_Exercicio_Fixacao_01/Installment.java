package entities_Exercicio_Fixacao_01;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Installment {
	private	LocalDate date;
	private Double amount;
	
	private static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	private Installment() {
	}
	
	public Installment(LocalDate date, Double amount) {
		this.date = date;
		this.amount = amount;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDueDate(LocalDate date) {
		this.date = date;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return  date.format(fmt) + " - " + String.format("%.2f", amount);
	}
}
