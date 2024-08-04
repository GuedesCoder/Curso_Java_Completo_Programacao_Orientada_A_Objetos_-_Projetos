package entities_Services_Exercicio_Fixacao_01;

public interface IONlinePaymentService {

	double paymentFee(Double amount);
	
	double interest(Double amount, Integer month);
}
