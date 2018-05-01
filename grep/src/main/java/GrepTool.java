import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

class GrepTool{
	String grep(String phrase, List<String> args, List<String> files) {
		String remit = "";

		for (String file : files) {
			List<String> lines = getLines(file);
			for (int lineNumber = 0; lineNumber < lines.size(); lineNumber++) {
				String line = lines.get(lineNumber);
				if (line.contains(phrase) ||
						args.contains("-i") && line.toLowerCase().contains(phrase.toLowerCase()))
					remit += args.contains("-n") ? (lineNumber + 1) + ":" + line + '\n' : line + '\n';
			}
		}

		return remit.trim();
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