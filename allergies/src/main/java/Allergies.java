import java.util.List;
import java.util.ArrayList;
import java.util.Stack;

public class Allergies {

	private List<Allergen> list = new ArrayList<>();

	Allergies(int score) {
		String bools = Integer.toBinaryString(score);

		while (bools.length() < Allergen.values().length)
			bools = '0' + bools;

		int i = Allergen.values().length;
		for (Allergen a : Allergen.values())
			if (bools.charAt(--i) == '1')
				list.add(a);
	}

	public List<Allergen> getList() {
		return list;
	}

	public boolean isAllergicTo(Allergen input) {
		return list.contains(input);
	}

}
