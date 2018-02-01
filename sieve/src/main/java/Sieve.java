import java.util.List;
import java.util.ArrayList;

class Sieve {

	private int maxPrime;
	private List<Integer> primes = new ArrayList<Integer>();

	Sieve(int maxPrime) {
		boolean[] notPrime = new boolean[maxPrime+1];

		for (int i = 2; i < Math.sqrt(maxPrime); i++)
			if (notPrime[i] == false)
				for (int j = i * i; j <= maxPrime; j += i)
					notPrime[j] = true;

		for (int i = 2; i < notPrime.length; i++)
			if (notPrime[i] == false)
				primes.add(i);
	}

	List<Integer> getPrimes() { return primes; }
}
