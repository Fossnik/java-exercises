class Bob {

	private String impetus;

	public String hey(String input) {
		impetus = input.trim();

		if (isShouting())
			return "Whoa, chill out!";

		if (isForceFull() && isQuestion())
			return "Calm down, I know what I'm doing!";

		if (isQuestion() && !isForceFull())
			return "Sure.";

		if (impetus.isEmpty())
			return "Fine. Be that way!";

		return "Whatever.";
	}

	private boolean isShouting() {
		return impetus.endsWith("!") || (isForceFull() && !isQuestion());
	}

	private boolean isQuestion() {
		return impetus.endsWith("?");
	}

	private boolean isForceFull() {
		// if there are letters, none are lowercase
		return impetus.matches("[A-Z\\s]+") && impetus.matches("[^a-z]+");
	}

}
