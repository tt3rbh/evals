import java.io.*;

public class Multiples {
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
				
				int x = Integer.parseInt(nums[0]);
				int n = Integer.parseInt(nums[1]);
				int prod = n;
				
				while (prod < x) {
					prod += n;
				}
				
				System.out.println(prod);
			}
		}
	}
}
