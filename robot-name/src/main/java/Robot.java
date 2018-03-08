import java.util.Random;
import java.util.HashSet;
import java.util.Set;

class Robot {

	private String name;
	private Set<String> nameRegistrar = new HashSet<>();

	Robot() {
		this.name = generateName();
		nameRegistrar.add(this.name);
	}

	private String generateName() {
		StringBuilder possibleName = new StringBuilder("");
		Random r = new Random();
		do {
			possibleName.append((char) (r.nextInt(26) + 'A'));
			possibleName.append((char) (r.nextInt(26) + 'A'));
			possibleName.append(r.nextInt(10));
			possibleName.append(r.nextInt(10));
			possibleName.append(r.nextInt(10));
		} while (nameRegistrar.contains(possibleName.toString()));

		return possibleName.toString();
	}

	public String getName() {
		return this.name;
	}

	public void reset() {
		nameRegistrar.remove(this.name);
		nameRegistrar.add(this.name = generateName());
	}

}
