import java.util.List;
import java.util.ArrayList;

class ProteinTranslator {

	List<String> translate(String rnaSequence) {

		ArrayList<String> protein = new ArrayList<String>();
		String codon;

		// process rnaSequence string by 3 char increments
		for (int offset = 0; offset < rnaSequence.length(); offset += 3) {
			codon = rnaSequence.substring(offset, offset + 3);

			switch (codon) {
				case "AUG":
					protein.add("Methionine");
					break;

				case "UUU": case "UUC":
					protein.add("Phenylalanine");
					break;

				case "UUA": case "UUG":
					protein.add("Leucine");
					break;

				case "UCU": case "UCC": case "UCA": case "UCG":
					protein.add("Serine");
					break;

				case "UAU": case "UAC":
					protein.add("Tyrosine");
					break;

				case "UGU": case "UGC":
					protein.add("Cysteine");
					break;

				case "UGG":
					protein.add("Tryptophan");
					break;

				case "UAA": case "UAG": case "UGA":
					return protein; // STOP
			}

		}

		return protein;
	}

}
