class Hamming {
	private String leftStrand;
	private String rightStrand;

	Hamming(String leftStrand, String rightStrand) {
		if (leftStrand.length() != rightStrand.length())
			throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");

    // given String inputs define these values within the class object
		this.leftStrand = leftStrand;
		this.rightStrand = rightStrand;
	}

	int getHammingDistance() {
		int hammingDistance = 0;

		for (int i = 0; i < leftStrand.length(); i++) {
			if (leftStrand.charAt(i) != rightStrand.charAt(i))
				hammingDistance++;
		}

		return hammingDistance;
	}

}
