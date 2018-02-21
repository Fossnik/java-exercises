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

		// if there are letters, none are lowercase
		if (impetus.matches("[A-Z\\s]+") && impetus.matches("[^a-z]+"))
			return true;

		return false;
	}

	private boolean isQuestion() {
		return impetus.endsWith("?");
	}

}
