class BracketChecker {

	private String input;

	BracketChecker(String input) {
		this.input = input;
	}

	public boolean areBracketsMatchedAndNestedCorrectly() {
		// test for left/right bracket parity
		return input.replaceAll("\\[","").length() == input.replaceAll("\\]", "").length()
		    && input.replaceAll("\\(","").length() == input.replaceAll("\\)", "").length()
		    && input.replaceAll("\\{","").length() == input.replaceAll("\\}", "").length();
	}

}
