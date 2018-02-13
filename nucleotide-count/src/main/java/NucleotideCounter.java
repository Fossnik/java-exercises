import java.util.Map;
import java.util.HashMap;

class NucleotideCounter {

  private HashMap<Character, Integer> counts = new HashMap<>();

  NucleotideCounter(String strand) {
    int A = 0, C = 0, G = 0, T = 0;

    for (Character c : strand.toCharArray())
      if      (c.equals('A')) A++;
      else if (c.equals('C')) C++;
      else if (c.equals('G')) G++;
      else if (c.equals('T')) T++;
      else throw new IllegalArgumentException("only A, C, G, or T");

    this.counts.put('A', A);
    this.counts.put('C', C);
    this.counts.put('G', G);
    this.counts.put('T', T);
  }

  public HashMap<Character, Integer> nucleotideCounts() {
    return counts;
  }

}
