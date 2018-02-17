import java.util.Random;

class Robot {

	private String name;

	public Robot() {
		this.name = "";

		Random r = new Random();

		this.name += (char)(r.nextInt(26) + 'A');
		this.name += (char)(r.nextInt(26) + 'A');

		this.name += r.nextInt(10);
		this.name += r.nextInt(10);
		this.name += r.nextInt(10);
	}

	public String getName() {
		return this.name;
	}

	public void reset() {
		this.name = new Robot().getName();
	}

}
