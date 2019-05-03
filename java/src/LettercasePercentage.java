import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LettercasePercentage {
	public static void main (String[] args) throws IOException {
		File file = new File(args[0]);
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		
		String line;
		while ((line = buffer.readLine()) != null) {
			line = line.trim();
	        
			if (line.length() > 0) {
				int upper = 0;
				int lower = 0;
				
				for (int i = 0; i < line.length(); i++) {
					if (Character.isUpperCase(line.charAt(i))) {
						upper++;
					} else {
						lower++;
					}
				}
				
				//System.out.println("Lower: " + lower + ", upper: " + upper);
				
				float lowerp = (float)lower/((float)upper + (float)lower) * (float)100;
				float upperp = (float)upper/((float)upper + (float)lower) * (float)100;
				
				System.out.format("lowercase: %1$2.2f uppercase: %2$2.2f\n", lowerp, upperp);
			}
		}
		
		buffer.close();
	}
}
