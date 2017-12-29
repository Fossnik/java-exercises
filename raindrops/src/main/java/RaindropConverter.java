class RaindropConverter {
	private String out = "";

	String convert(int number) {
		// use the modulus to determine factorability.
		if (number % 3 == 0) out += "Pling";
		if (number % 5 == 0) out += "Plang";
		if (number % 7 == 0) out += "Plong";

		if (out.length() > 0)
			return out;

		return Integer.toString(number);
	}

}
