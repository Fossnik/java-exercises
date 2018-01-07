class Acronym {

	private String acronym = "";
	private Boolean whitespace = true;

	Acronym(String phrase) {

		// loop through a Char Array of the input phrase, noting whitespaces
		for (char c : phrase.toCharArray()) {
			// if preceding char is a space (or dash), add the initial to the acronym
			if (whitespace == true) {
				acronym += Character.toUpperCase(c);
				whitespace = false;
			}
			else if (c == ' ' || c == '-') {
				whitespace = true;
			}

		}
	}

	String get() {
		return acronym;
	}

}
