import java.util.Map;
import java.util.HashMap;

class NucleotideCounter {

  private String strand;
  private HashMap<Character, Integer> counts = new HashMap<>();

  NucleotideCounter(String strand) {
    this.strand = strand;
  }

  public HashMap<Character, Integer> nucleotideCounts() {
    int A = 0, C = 0, G = 0, T = 0;

    for (Character c : this.strand.toCharArray()) {
      if      (c.equals('A')) A++;
      else if (c.equals('C')) C++;
      else if (c.equals('G')) G++;
      else if (c.equals('T')) T++;
    }

    counts.put('A', A);
    counts.put('C', C);
    counts.put('G', G);
    counts.put('T', T);

    return counts;
  }

}
