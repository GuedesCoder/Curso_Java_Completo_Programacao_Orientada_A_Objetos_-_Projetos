package services_Defender_Methods;

import java.security.InvalidParameterException;

public interface IInterestService {

	public double getInterestRate();

	default double payment(double amount, int months) {
		if (months < 1) {
			throw new InvalidParameterException("MONTHS MUST BE GREATER THAN ZERO ASSHOLE.");
		}
		return amount * Math.pow((1 + getInterestRate() / 100.00), months);
	}
}
