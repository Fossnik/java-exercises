import java.util.List;
import java.util.ArrayList;
import java.util.Stack;

public class Allergies {

	private List<Allergen> list = new ArrayList<>();

	Allergies(int score) {
		int numEnums = Allergen.values().length;
		int maxScore = 0;
		for (Allergen a : Allergen.values())
			maxScore += a.getScore();

		String isAllergy = Integer.toBinaryString(score);

		// String length normalization
		if (score > maxScore)
			while (isAllergy.length() > numEnums)
				isAllergy = isAllergy.substring(1);
		else
			while (isAllergy.length() < numEnums)
				isAllergy = '0' + isAllergy;

		int i = numEnums;
		for (Allergen a : Allergen.values())
			if (isAllergy.charAt(--i) == '1')
				list.add(a);
	}

	public List<Allergen> getList() {
		return list;
	}

	public boolean isAllergicTo(Allergen input) {
		return list.contains(input);
	}

}
