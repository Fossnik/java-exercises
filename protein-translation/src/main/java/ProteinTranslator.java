import java.util.List;
import java.util.ArrayList;

class ProteinTranslator {

	private ArrayList<String> protein = new ArrayList<String>();

	List<String> translate(String rnaSequence) {

		if (rnaSequence == "AUG")
			protein.add("Methionine");

		return protein;
	}
}
