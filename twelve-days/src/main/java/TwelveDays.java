class TwelveDays {

	private String[] ordinals = new String[] {"zeroeth", "first", "second", "third", "fourth", "fifth", "sixth", "seventh", "eighth", "ninth", "tenth", "eleventh", "twelfth"};

	String verse(int verseNumber) {
		String v = new String("On the " + ordinals[verseNumber] + " day of Christmas my true love gave to me, ");

		switch(verseNumber) {
			case 12: 	v += "twelve Drummers Drumming, ";
			case 11: 	v += "eleven Pipers Piping, ";
			case 10: 	v += "ten Lords-a-Leaping, ";
			case 9:		v += "nine Ladies Dancing, ";
			case 8:		v += "eight Maids-a-Milking, ";
			case 7:		v += "seven Swans-a-Swimming, ";
			case 6:		v += "six Geese-a-Laying, ";
			case 5:		v += "five Gold Rings, ";
			case 4:		v += "four Calling Birds, ";
			case 3:		v += "three French Hens, ";
			case 2:		v += "two Turtle Doves, ";
			case 1:
				if (verseNumber == 1) v += "a Partridge in a Pear Tree.\n";
				else v += "and a Partridge in a Pear Tree.\n";
		}

		return v;
	}

	String verses(int startVerse, int endVerse) {
		String vs = new String("");

		while (startVerse < endVerse)
			vs += verse(startVerse++) + "\n";

		return vs + verse(endVerse);
	}

	String sing() {
		return verses(1, 12);
	}

}
