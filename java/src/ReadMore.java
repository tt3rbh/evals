import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadMore {
	public static void main (String[] args) throws IOException {
		File file = new File(args[0]);
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		
		String line;
		while ((line = buffer.readLine()) != null) {
			line = line.trim();
	        
			if (line.length() > 0) {
				if (line.length() > 55) {
					char lastChar = line.charAt(40);
					
					line = line.substring(0, 40);
					
					if (lastChar != ' ') {
						int trimPos = line.lastIndexOf(' ');
						if (trimPos > -1) {
							line = line.substring(0, trimPos);
						}
					}
					
					line = line.trim();
					line += "... <Read More>";
				}
			}
			
			System.out.println(line);
		}
		
		buffer.close();
	}
}
