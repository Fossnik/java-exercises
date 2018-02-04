import java.util.List;
import java.util.ArrayList;

class KindergartenGarden {

	ArrayList<Plant> remit = new ArrayList<>();

	private String garden;

	KindergartenGarden(String garden, String[] students) {
		throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
	}

	KindergartenGarden(String garden) {
		this.garden = garden;
	}

	List<Plant> getPlantsOfStudent(String student) {
		int studentIndex = ((int)student.charAt(0) - (int)'A') * 2;

		for (String row : garden.split("\n"))
			for (int i : new int[]{studentIndex, studentIndex + 1})
				switch (row.charAt(i)) {
					case 'C':
						remit.add(Plant.CLOVER);
						break;
					case 'G':
						remit.add(Plant.GRASS);
						break;
					case 'R':
						remit.add(Plant.RADISHES);
						break;
					case 'V':
						remit.add(Plant.VIOLETS);
						break;
				}

		return remit;
	}

}
