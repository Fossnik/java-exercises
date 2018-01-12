class LargestSeriesProductCalculator {

	private String inputNumber;

	LargestSeriesProductCalculator(String inputNumber) {
		this.inputNumber = inputNumber;
	}

	long calculateLargestProductForSeriesLength(int numberOfDigits) {

		long largest = 0L;

		// iterate through each grouping of digits
		for (int i = numberOfDigits; i <= inputNumber.length(); i++) {

			// find the product of the group of digits
			long product = 1L;
			for (int n = numberOfDigits; n > 0; n--)
				product *= Character.getNumericValue(inputNumber.charAt(i - n));

			// keep track of the largest product
			if (product > largest)
				largest = product;

		}

		return largest;
	}

}
