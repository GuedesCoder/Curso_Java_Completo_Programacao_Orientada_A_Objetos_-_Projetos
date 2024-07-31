package entities_Secao_9_Exercicio_em_Aula_147;

import java.time.Instant;

import entities_enums_Secao_9_Exercicio_em_Aula_147.OrderStatus;

public class Order {
	private Integer id;
	private Instant moment;
	private OrderStatus status;

	public Order() {
	}

	public Order(Integer id, Instant moment, OrderStatus status) {
		this.id = id;
		this.moment = moment;
		this.status = status;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Instant getMoment() {
		return moment;
	}

	public void setMoment(Instant moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Order [Id: " + id + "; Date: " + moment + "; Status: " + status + "]";
	}

}
