import java.util.ArrayList;
import java.util.List;

class PrimeFactorsCalculator {

	private static List<Long> remit = new ArrayList<Long>();
	private static long divisor = 2L;

	public static List<Long> calculatePrimeFactorsOf(long input) {

		// base case
		if (input < divisor) {
			return remit;

		} else if (input % divisor == 0) {
			remit.add(divisor);
			return calculatePrimeFactorsOf(input / divisor);

		} else {
			divisor++;
			return calculatePrimeFactorsOf(input);
		}
	}

}
