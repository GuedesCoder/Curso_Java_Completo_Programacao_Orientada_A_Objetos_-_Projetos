package application_Secao_9_Exercicio_em_Aula_147;

import java.time.Instant;

import entities_Secao_9_Exercicio_em_Aula_147.Order;
import entities_enums_Secao_9_Exercicio_em_Aula_147.OrderStatus;

public class Program {

	public static void main(String[] args) {
		Order order1 = new Order(1, Instant.now(), OrderStatus.PROCESSING);
		Order order2 = new Order(2, Instant.now(), OrderStatus.valueOf("DELIVERED"));
		
		System.out.println(order1);
		System.out.println(order2);
	}

}
