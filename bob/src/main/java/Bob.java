class Bob {

	private String impetus;

	public String hey(String input) {
		impetus = input.trim();

		if (isShouting())
			return "Whoa, chill out!";

		return "Whatever.";
	}

	private boolean isShouting() {
		if (impetus.endsWith("!"))
			return true;

		// no lowercase characters
		if (impetus.matches("[^a-z]+"))
			return true;

		return false;
	}

}
