class PrimeCalculator {

  int nth(int nth) {

    int lastP = 0;
    boolean isP = true;

    for (int i = 2; lastP < nth; i++) {
      for (int j = 2; j <= i / 2; j++)
        if (i % j == 0) {
          isP = false;
          break;
        }
          
      if (isP)
        lastP = i;
    }

    return lastP;
  }

}
