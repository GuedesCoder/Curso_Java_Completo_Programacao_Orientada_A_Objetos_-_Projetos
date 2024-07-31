package application_Exercicio_Fixacao_02;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities_Exercicio_Fixacao_02.Pessoa;
import entities_Exercicio_Fixacao_02.PessoaFisica;
import entities_Exercicio_Fixacao_02.PessoaJuridica;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Pessoa> pagadorDeImposto = new ArrayList<>();

		System.out.print("Qual a quantidade de pessoas que pagarão imposto: ");
		int quantidadeDePessoas = sc.nextInt();
		for (int i = 1; i <= quantidadeDePessoas; i++) {
			System.out.println("Dados do  " + i + "º pagador: ");
			System.out.print("Pessoa Fisica ou Pessoa Jurídica (f / j)? ");
			char tipoDePessoa = sc.next().charAt(0);
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Renda anual: ");
			Double renda = sc.nextDouble();
			if (tipoDePessoa == 'f') {
				System.out.print("Gastos com saúde: ");
				Double gastosSaude = sc.nextDouble();

				pagadorDeImposto.add(new PessoaFisica(nome, renda, gastosSaude));
			} else {
				System.out.print("Número de funcionarios: ");
				Integer quantidadeFuncionarios = sc.nextInt();

				pagadorDeImposto.add(new PessoaJuridica(nome, renda, quantidadeFuncionarios));
			}
		}

		System.out.println();
		System.out.println("IMPOSTOS PAGOS POR PESSOA:");
		double somaDosImpostos = 0.00;
		for (Pessoa pessoa : pagadorDeImposto) {
			double imposto = pessoa.imposto();
			System.out.println(pessoa.getNome() + ": $ " + String.format("%.2f", imposto));
			somaDosImpostos += imposto;
		}

		System.out.println();
		System.out.println("TOTAL DOS IMPOSTOS: " + String.format("%.2f", somaDosImpostos));

		sc.close();
	}

}
