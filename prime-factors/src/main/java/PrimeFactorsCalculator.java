import java.util.ArrayList;
import java.util.List;

class PrimeFactorsCalculator {

	private List<Long> remit = new ArrayList<Long>();
	private Long divisor = 2L;

	public List<Long> calculatePrimeFactorsOf(Long input) {

		// base case
		if (input < divisor) {
			return remit;
		} else if (input.equals(divisor)) {
			remit.add(divisor);
			return remit;
		}

		if (input % divisor == 0) {
			remit.add(divisor);
			return calculatePrimeFactorsOf(input / divisor);
		} else {
			divisor++;
			return calculatePrimeFactorsOf(input);
		}
	}

}
