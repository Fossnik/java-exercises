class Bob {

	private String impetus;

	public String hey(String input) {
		impetus = input.trim();

		if (isShouting())
			return "Whoa, chill out!";

		if (isQuestion())
			return "Sure.";

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

	private boolean isQuestion() {
		return impetus.endsWith("?");
	}

}
