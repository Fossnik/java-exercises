import java.util.Map;
import java.util.HashMap;

class NucleotideCounter {

  private String strand;
  private HashMap<Character, Integer> counts = new HashMap<>();

  NucleotideCounter(String strand) {
    this.strand = strand;
  }

  public HashMap<Character, Integer> nucleotideCounts() {
    counts.put('A', 0);
    counts.put('C', 0);
    counts.put('G', 0);
    counts.put('T', 0);

    return counts;
  }

}
