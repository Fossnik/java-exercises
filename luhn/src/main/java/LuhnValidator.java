class LuhnValidator {

	boolean isValid(String candidate) {
		int sum = 0;
		Boolean odd = false;

		for (char c : new StringBuilder(candidate).reverse().toString().toCharArray()) {
			if (Character.isDigit(c))
				if (odd =! odd) // test and flip
					sum += Character.getNumericValue(c);
				else
					if (Character.getNumericValue(c) * 2 > 9)
						sum += Character.getNumericValue(c) * 2 - 9;
					else
						sum += Character.getNumericValue(c) * 2;
				else if (!Character.isSpace(c))
					return false;
		}

		// not clear why " 00000" should be valid and " 0" invalid, however...
		if (sum == 0 && candidate.length() < 6)
			return false;

		return sum % 10 == 0;
	}

}
