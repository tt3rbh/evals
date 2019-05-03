import java.io.*;


public class SumOfDigits {
	public static void main (String[] args) throws IOException {
		File file = new File(args[0]);
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		
		String line;
		while ((line = buffer.readLine()) != null) {
			line = line.trim();
	        
			if (line.length() > 0) {
				int sum = 0;
				char[] digits = line.toCharArray();
				
				for (int i = 0; i < digits.length; i++) {
					sum += Character.digit(digits[i], 10);
				}
				
				System.out.println(sum);
			}
		}
	}
}
