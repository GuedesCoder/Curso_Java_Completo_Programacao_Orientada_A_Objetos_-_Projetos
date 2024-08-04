package services_Defender_Methods;

public class UsaInterestService implements IInterestService {
	private double interestRate;

	public UsaInterestService(Double interestRate) {
		this.interestRate = interestRate;
	}

	@Override
	public double getInterestRate() {
		return interestRate;
	}
}
