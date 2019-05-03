import java.io.*;
import java.util.ArrayList;

public class LongestLines {
	public static void main (String[] args) throws IOException {
		File file = new File(args[0]);
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		
		int linesToOutput = 0;
		ArrayList<String> lines = new ArrayList<String>();

		String line;
		
		line = buffer.readLine();
		if (line != null) {
			linesToOutput = Integer.parseInt(line);
		}
		
		while ((line = buffer.readLine()) != null) {
			int index = 0;
			
			while ((index < lines.size()) && (index < linesToOutput)) {
				if (line.length() > lines.get(index).length()) {
					break;
				}
				
				index++;
			}
			
			if (index < linesToOutput) {
				lines.add(index, line);
			}
		}
		
		for (int i = 0; i < linesToOutput; i++) {
			System.out.println(lines.get(i));
		}
		
		buffer.close();
	}
}
