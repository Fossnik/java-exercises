import java.util.ArrayList;
import java.util.List;

class PrimeFactorsCalculator {

	public static List<Long> calculatePrimeFactorsOf(Long input) {
		List<Long> remit = new ArrayList<Long>();

		for (Long l = 2L; l < input / 2; l++)
			if (input % l == 0)
				remit.add(l);

		return remit;
	}

}
