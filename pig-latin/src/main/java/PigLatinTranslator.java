class PigLatinTranslator {

  public PigLatinTranslator() {}

  public String translate(String word) {
    if ("aeiou".contains(String.valueOf(word.charAt(0))))
      return word+"ay";

    return "";
  }

}
