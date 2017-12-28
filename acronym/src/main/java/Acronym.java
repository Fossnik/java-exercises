class Acronym {

	protected String phrase;
	protected String acronym = "";

	Acronym(String phrase) {
		this.phrase = phrase;
	}

	String get() {
		// assume the first character will be the first initial in the acronym
		acronym += phrase.toUpperCase().charAt(0);

		// loop through phrase
		for (int i = 1; i <= phrase.length() - 1; i++) {
			// if preceding char is a space (or dash), add the initial to the acronym
			if (phrase.charAt(i - 1) == ' ' || phrase.charAt(i - 1) == '-')
				acronym += phrase.toUpperCase().charAt(i);
		}

		return acronym;
	}

}
