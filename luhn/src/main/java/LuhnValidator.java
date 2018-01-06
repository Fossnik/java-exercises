class LuhnValidator {

	boolean isValid(String candidate) {
		int sum = 0;
		Boolean odd = false;

		for (char c : new StringBuilder(candidate).reverse().toString().toCharArray()) {
			if (Character.isDigit(c))
				if ((odd =! odd) == true)
					sum += Character.getNumericValue(c);
				else
					if (Character.getNumericValue(c) * 2 > 9)
						sum += Character.getNumericValue(c) * 2 - 9;
					else
						sum += Character.getNumericValue(c) * 2;
		}

		return sum % 10 == 0;
	}

}
