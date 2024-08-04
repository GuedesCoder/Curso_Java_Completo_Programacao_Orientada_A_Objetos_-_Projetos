package services_Defender_Methods;

public class BrazilInterestService implements IInterestService {
	private double interestRate;

	public BrazilInterestService(Double interestRate) {
		this.interestRate = interestRate;
	}

	@Override
	public double getInterestRate() {
		return interestRate;
	}
}
