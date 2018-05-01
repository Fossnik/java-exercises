import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

class GrepTool{
	String grep(String phrase, List<String> arguments, List<String> files) {
		String remit = "";

		if (arguments.isEmpty())
			for (String file : files)
				for (String line : getLines(file))
					if (line.contains(phrase))
						remit += line;

		return remit;
	}

	private List<String> getLines(String path) {
		String line;
		List<String> lines = new ArrayList<>();

		try(BufferedReader br = new BufferedReader(new FileReader(path))) {
			while ((line = br.readLine()) != null)
				lines.add(line);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return lines;
	}
}