import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

class GrepTool{
	String grep(String phrase, List<String> args, List<String> files) {
		String remit = "";

		if (args.contains("-l"))
			return printFileNames(files, phrase);

		for (String file : files) {
			List<String> lines = getLines(file);
			for (int lineNumber = 0; lineNumber < lines.size(); lineNumber++) {
				String line = lines.get(lineNumber);
				if (Matches(phrase, args, line)) {
					if (files.size() > 1)
						remit += file + ":";
					remit += args.contains("-n") ? (lineNumber + 1) + ":" + line + '\n' : line + '\n';
				}
			}
		}

		return remit.trim();
	}

	private boolean Matches(String phrase, List<String> args, String line) {
		if (args.contains("-i")) {
			phrase = phrase.toLowerCase();
			line = line.toLowerCase();
		}

		if (args.contains("-x"))
			return line.equals(phrase);

		if (args.contains("-v"))
			return !line.contains(phrase);

		return line.contains(phrase);
	}

	private String printFileNames(List<String> files, String phrase) {
		String remit = "";
		for (String file : files)
			for (String line : getLines(file))
				if (line.contains(phrase))
					remit += file;

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