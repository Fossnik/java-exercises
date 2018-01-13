import java.util.List;
import java.util.ArrayList;

class Sieve {

	private int maxPrime;

	Sieve(int maxPrime) {
		this.maxPrime = maxPrime;
	}

	List<Integer> getPrimes() {
		List<Integer> primes = new ArrayList<Integer>();

		for (int i = 2; i <= maxPrime; i++) {
			boolean isPrime = true;
			for (int j = 2; j <= i / 2; j++)
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			if (isPrime == true)
				primes.add(i);
		}

		return primes;
	}
}
