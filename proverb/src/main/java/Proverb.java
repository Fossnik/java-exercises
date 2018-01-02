class Proverb {

	// output String
	String remit = new String("");

	Proverb(String[] words) {

		int i = 0;
		while (i + 2 <= words.length) {
			// increment using ++i to parse addition operation before resolving 'i'
			remit += "For want of a " + words[i] + " the " + words[++i] + " was lost.\n";
		}

		// no words are given; zero length array causes OOB exception
		try {
			remit += "And all for the want of a " + words[0] + '.';
		} catch (ArrayIndexOutOfBoundsException e) {
			remit = "";
		}

	}

	String recite() {
		return remit;
	}

}
