class PigLatinTranslator {

	public PigLatinTranslator() {}

	public String translate(String word) {

		if (word.split(" ").length > 1) {
			String out = "";
			for (String s : word.split(" "))
				out += translate(s) + " ";

			return out.trim();
		}

		if (word.matches("^(ch|qu|the|rh).*")
			return word.substring(2)+word.substring(0,2)+"ay";

		if (word.matches("^(sch|squ|thr).*"))
			return word.substring(3)+word.substring(0,3)+"ay";

		if ("aeiou".contains(String.valueOf(word.charAt(0))) ||
				word.matches("^(x|y)(?!e).*"))
			return word+"ay";

		return word.substring(1)+word.charAt(0)+"ay";
	}

}
