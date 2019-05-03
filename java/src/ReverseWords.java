import java.io.*;

public class ReverseWords {
	public static void main (String[] args) throws IOException {
		File file = new File(args[0]);
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		
		String line;
		while ((line = buffer.readLine()) != null) {
			line = line.trim();
	        
			if (line.length() > 0) {
				String[] words = line.split(" ");
				
				for (int i = (words.length - 1); i >= 0; i--) {
					if (i != (words.length - 1)) {
						System.out.print(" ");
					}
					
					System.out.print(words[i]);
				}
				
				System.out.println();
			}
		}
	}
}
