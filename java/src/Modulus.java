import java.io.*;


public class Modulus {
	public static void main (String[] args) throws IOException {
		File file = new File(args[0]);
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		
		String line;
		while ((line = buffer.readLine()) != null) {
			line = line.trim();
	        
			if (line.length() > 0) {
				String[] nums = line.split(",");
				
				if (nums.length != 2) {
					continue;
				}
				
				int n = Integer.parseInt(nums[0]);
				int m = Integer.parseInt(nums[1]);

				int quotient = n/m;
				int remainder = n - (quotient * m);
				
				System.out.println(remainder);
			}
		}
	}
}
