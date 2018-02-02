class RotationalCipher {

	private int shiftKey;

	RotationalCipher(int shiftKey) {
		this.shiftKey = shiftKey;
	}

	String rotate(String data) {
		String remit = "";

		for (char c : data.toCharArray())
			if (Character.isLowerCase(c))
				remit += (char)(((int)c - (int)'a' + shiftKey) % 26 + (int)'a');
			else
				remit += (char)(((int)c - (int)'A' + shiftKey) % 26 + (int)'A');

		return remit;
	}

}
