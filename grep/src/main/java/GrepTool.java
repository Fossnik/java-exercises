import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

class GrepTool{
	String grep(String phrase, List<String> arguments, List<String> files) {
		String remit = "";

		for (String file : files) {
			List<String> lines = getLines(file);
			String line = "";
			for (int lineNumber = 1; lineNumber < lines.size(); line = lines.get(lineNumber++))
				if (line.contains(phrase))
					remit += arguments.contains("-n") ? (lineNumber + 1) + ":" + line + '\n' : line + '\n';
		}

		return remit.substring(0, remit.length() - 1);
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