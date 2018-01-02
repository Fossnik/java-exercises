import java.util.ArrayList;
import java.util.List;

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
"For want of a battle the kingdom was lost."
	};

	Proverb(String[] words) {
		this.werdz = words;
	}

	String recite() {
		// build output String
		String proverbialOutput = new String("");

		// keep track of used proverbs to avoid repeating
		List<Integer> used = new ArrayList<Integer>();

		// iterate through input words
		for (int i = 0; i < werdz.length; i++) {
			// search for given input word in each proverb
			for (int j = 0; j < proverbs.length; j++) {
				// add a proverb to output string if it is found.
				if (proverbs[j].indexOf(werdz[i]) != -1) {
					// don't repeat previously used proverbs
					if (!(used.contains(j))) {
						// a newline character preface is required, but not initially
						if (proverbialOutput.length() > 0)
							proverbialOutput += "\n";

						proverbialOutput += proverbs[j];

						// avoid repeating the proverb
						used.add(j);

						// don't match more than one.
						break;
					}

				}

			}

		}
		// the last sentence will reiterate the first
		if (werdz.length != 0)
			proverbialOutput += "\nAnd all for the want of a " + werdz[0] + ".";

		return proverbialOutput;
	}

}
