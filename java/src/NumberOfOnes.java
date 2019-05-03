import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class NumberOfOnes {
	public static void main (String[] args) throws IOException {
		File file = new File(args[0]);
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		
		String line;
		while ((line = buffer.readLine()) != null) {
			line = line.trim();
	        
			if (line.length() > 0) {
				int n = Integer.parseInt(line);

				String bits = Integer.toBinaryString(n);
				
				int oneCnt = 0;
				for (int i = 0; i < bits.length(); i++) {
					if (bits.charAt(i) == '1') {
						oneCnt++;
					}
				}
				
				System.out.println(oneCnt);
			}
		}
	}
}

