import java.util.List;
import java.util.ArrayList;

class Sieve {

	private int maxPrime;

	Sieve(int maxPrime) {
		this.maxPrime = maxPrime;
	}

	List<Integer> getPrimes() {
		List<Integer> primes = new ArrayList<Integer>();

		for (int i = 2; i <= maxPrime / 2 + 1; i++)
			if (maxPrime % i == 0)
				primes.add(i);

		return primes;
	}
}
