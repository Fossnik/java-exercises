public class PangramChecker {

	public boolean isPangram(String input) {
		// instead of manually defining the 26 alphabetical letters, we can
		// utilize ASCII, which already encapsulates that alphabet sequence.
		// this can be implemented through casting likeso:
		// int theNumberOfLetterA = (int)'a'; // 97th char in ASCII

		// iterate - seek an instance of each alphabetical within our input string
		for (int alpha = 'a'; alpha <= 'z'; alpha++) {
			if (input.toLowerCase().indexOf(alpha) == -1)
				return false;
		}

		return true;
	}

}
