class NaturalNumber {

  private int number;
  private int aliquot;

  NaturalNumber(int number) {
    // throw exception for illegal arguments
    if (number <= 0)
      throw new IllegalArgumentException("You must supply a natural number (positive integer)");
    // define object values
    this.number = number;
    this.aliquot = 0;
  }

  Classification getClassification() {
    // resolve the aliquot sum
    for (int i = number/2; i > 0; i--) {
      if (number % i == 0)
        aliquot += i;
    }

    if (aliquot == number)
      return Classification.PERFECT;

    if (aliquot > number)
      return Classification.ABUNDANT;

    // if (aliquot < number) (implied)
    return Classification.DEFICIENT;
  }

}
