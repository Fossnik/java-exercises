class PrimeCalculator {

  int nth(int nth) {
    if (nth < 1)
      throw new IllegalArgumentException("negative");

    int numPrimes = 0;
    int lastP = 0;
    boolean isP = true;

    for (int over = 2; numPrimes < nth; over++) {
			isP = true;
			for (int under = 2; under <= over / 2; under++)
				if (over % under == 0) {
					isP = false;
					break;
				}

      if (isP) {
        numPrimes++;
        lastP = over;
      }
    }

    return lastP;
  }

}
