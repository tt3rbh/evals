import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class MinimumCoins {
	public static void main (String[] args) throws IOException {
		File file = new File(args[0]);
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		
		String line;
		while ((line = buffer.readLine()) != null) {
			line = line.trim();
	        
			if (line.length() > 0) {
				int n = Integer.parseInt(line);
				int nCoins = 0;
				
				nCoins += (n / 5);
				n = (n % 5);
				nCoins += (n / 3);
				n = (n % 3);
				nCoins += n;

				System.out.println(nCoins);
			}
		}
	}
}
