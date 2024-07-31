package application_Secao_14_Exercicio_Em_Aula_157;

import entities_Secao_14_Exercicio_Em_Aula_157.Account;
import entities_Secao_14_Exercicio_Em_Aula_157.BusinessAccount;
import entities_Secao_14_Exercicio_Em_Aula_157.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		
		Account account1 = new Account(1001, "João", 4500.00);
		account1.withdraw(500.00);
		Account account2 = new SavingsAccount(1002, "Maria", 4500.00, 0.1);
		account2.withdraw(500.00);
		Account account3 = new BusinessAccount(1003, "José", 4500.00, 0.00);
		account3.withdraw(500.00);
		
		System.out.println(account1.getBalance());
		System.out.println(account2.getBalance());
		System.out.println(account3.getBalance());

	}

}
