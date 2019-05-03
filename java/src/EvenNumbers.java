import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class EvenNumbers {
	public static void main (String[] args) throws IOException {
		File file = new File(args[0]);
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		
		String line;
		while ((line = buffer.readLine()) != null) {
			line = line.trim();
	        
			if (line.length() > 0) {
				int n = Integer.parseInt(line);

				System.out.println((n + 1) % 2);
			}
		}
	}
}

