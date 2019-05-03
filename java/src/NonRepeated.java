import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class NonRepeated {
	public static int countChars(String str, char c) {
		int cnt = 0;
		
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == c) {
				cnt++;
			}
		}
		
		return cnt;
	}
	
	
	public static void main (String[] args) throws IOException {
		File file = new File(args[0]);
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		
		String line;
		while ((line = buffer.readLine()) != null) {
			line = line.trim();
	        
			if (line.length() > 0) {
				for (int i = 0; i < line.length(); i++) {
					if (countChars(line, line.charAt(i)) == 1) {
						System.out.println(line.charAt(i));
						break;
					}
				}
			}
		}
		
		buffer.close();
	}
}
