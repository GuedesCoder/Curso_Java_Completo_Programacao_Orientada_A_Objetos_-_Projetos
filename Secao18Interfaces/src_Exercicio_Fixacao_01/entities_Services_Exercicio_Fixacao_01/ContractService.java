package entities_Services_Exercicio_Fixacao_01;

import java.time.LocalDate;

import entities_Exercicio_Fixacao_01.Contract;
import entities_Exercicio_Fixacao_01.Installment;

public class ContractService {

	private IONlinePaymentService onlinePaymentService;

	public ContractService(IONlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}

	public void processContract(Contract contract, int months) {
		double basicQuota = contract.getTotalValue() / months;

		for (int i = 1; i <= months; i++) {
			LocalDate dueDate = contract.getDate().plusMonths(i);
			
			double interest = onlinePaymentService.interest(basicQuota, i);
			double fee = onlinePaymentService.paymentFee(basicQuota + interest);
			double quota = basicQuota + interest + fee;
			
			contract.getInstallments().add(new Installment(dueDate, quota));
		}

	}
}
