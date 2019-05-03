import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class RollerCoaster {
	public static void main (String[] args) throws IOException {
		File file = new File(args[0]);
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		
		String line;
		while ((line = buffer.readLine()) != null) {
			line = line.trim();
			
			boolean upper = true;
			
			for (int i = 0; i < line.length(); i++) {
				if (Character.isLetter(line.charAt(i))) {
					if (upper) {
						System.out.print(Character.toUpperCase(line.charAt(i)));
					} else {
						System.out.print(Character.toLowerCase(line.charAt(i)));
					}
					
					upper = !upper;
				} else {
					System.out.print(line.charAt(i));
				}
			}
			
			System.out.println();
		}
		
		buffer.close();
	}
}
