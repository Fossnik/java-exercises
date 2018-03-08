import java.util.Random;
import java.util.HashSet;

class Robot {

	private String name;
	private static HashSet nameRegistrar = new HashSet<>();

	public Robot() {

		do {
			this.name = "";

			Random r = new Random();

			this.name += (char) (r.nextInt(26) + 'A');
			this.name += (char) (r.nextInt(26) + 'A');

			this.name += r.nextInt(10);
			this.name += r.nextInt(10);
			this.name += r.nextInt(10);

		} while (nameRegistrar.contains(this.name));

		nameRegistrar.add(this.name);

	}

	public String getName() {
		return this.name;
	}

	public void reset() {
		this.name = new Robot().getName();
	}

}
