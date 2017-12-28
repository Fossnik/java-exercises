public class PangramChecker {

	public boolean isPangram(String input) {
		String alphabet = "abcdefghijklmnopqrstuvwxyz";

		// redefine alphabet sans any chars found within input
		for (int i = 0; i < input.length(); i++) {
			alphabet = alphabet.replace(input.toLowerCase().charAt(i), ' ');
		}

		// test whether the alphabet string has been cleared
		for (int i = 0; i < alphabet.length(); i++) {
			if (alphabet.charAt(i) != ' ')
				return false;
		}

		return true;
	}

}
