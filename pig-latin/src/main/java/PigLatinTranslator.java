class PigLatinTranslator {

  public PigLatinTranslator() {}

  public String translate(String word) {

    String re = "^(ch|qu|the|rh).*";
    if (word.matches(re))
      return word.substring(2)+word.substring(0,2)+"ay";

    re = "^(sch|squ|thr).*";
    if (word.matches(re))
      return word.substring(3)+word.substring(0,3)+"ay";

    if ("aeiou".contains(String.valueOf(word.charAt(0))) ||
        word.matches("^(x|y)(?!e).*"))
      return word+"ay";

    return word.substring(1)+word.charAt(0)+"ay";

    // return "";
  }

}
