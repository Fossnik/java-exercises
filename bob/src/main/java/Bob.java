class Bob {

	private String impetus;

	public String hey(String input) {
		impetus = input.trim();

		if (isShouting())
			return "Whoa, chill out!";

		if (isYelledQuestion())
			return "Calm down, I know what I'm doing!";

		if (isQuestion())
			return "Sure.";

		if (impetus.isEmpty())
			return "Fine. Be that way!";

		return "Whatever.";
	}

	private boolean isShouting() {
		// if there are letters, none are lowercase
		if (impetus.matches("[A-Z\\s]+") && impetus.matches("[^a-z]+"))
			return true;

		return impetus.endsWith("!");
	}

	private boolean isQuestion() {
		return impetus.endsWith("?");
	}

	private boolean isYelledQuestion() {
		return impetus.matches("[A-Z\\s]+") && impetus.matches("[^a-z]+") && impetus.endsWith("?");
	}

}
