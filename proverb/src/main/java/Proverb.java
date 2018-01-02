class Proverb {

	// string array to be defined by Proverb(words)
	String[] werdz;

	// all of the potential proverbs
	String[] proverbs = new String[]{
"For want of a nail the shoe was lost.",
"For want of a shoe the horse was lost.",
"For want of a horse the rider was lost.",
"For want of a rider the message was lost.",
"For want of a message the battle was lost.",
"For want of a battle the kingdom was lost.",
"And all for the want of a horseshoe nail."
	};

	Proverb(String[] words) {
		this.werdz = words;
	}

	String recite() {
		// build output String
		String proverbialOutput = new String("");

		// iterate through input words
		for (int i = 0; i < werdz.length; i++) {
			// search for given input word in each proverb
			for (int j = 0; i < proverbs.length; j++) {
				// add a proverb to output string if it is found.
				if (proverbs[j].indexOf(werdz[i]) != -1) {
					// a newline character is required sometimes
					if (proverbialOutput.length() > 0)
						proverbialOutput += "\n";

					proverbialOutput += proverbs[j];

				}

			}

		}

		return proverbialOutput;
	}

}
