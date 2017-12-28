class ArmstrongNumbers {

	boolean isArmstrongNumber(int numberToCheck) {

		// resolve how many digits comprise the integer
		int numDigits = 0;

		for (int i = 1; numberToCheck / i > 1; i *= 10) {
			numDigits++;
		}

		// sum all of the digits
		int sum = 0;
		int remainder = numberToCheck;

		// iterate through each digit
		while (remainder > 1) {
			// sum each digit's exponential
			sum += Math.pow(remainder % 10, numDigits);
			remainder /= 10;
		}

		// returns true if the number is an armstrong number
		return sum == numberToCheck;
	}

}
