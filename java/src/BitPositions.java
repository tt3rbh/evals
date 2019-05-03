import java.io.*;

public class BitPositions {
	public static void main (String[] args) throws IOException {
		File file = new File(args[0]);
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		
		String line;
		while ((line = buffer.readLine()) != null) {
			line = line.trim();
	        
			if (line.length() > 0) {
				String[] nums = line.split(",");
				
				if (nums.length != 3) {
					continue;
				}
				
				int n = Integer.parseInt(nums[0]);
				int p1 = Integer.parseInt(nums[1]);
				int p2 = Integer.parseInt(nums[2]);
				
				String bits = Integer.toBinaryString(n);
				char[] chbits = bits.toCharArray();
				
				if (chbits[chbits.length - p1] == chbits[chbits.length - p2]) {
					System.out.println("true");
				} else {
					System.out.println("false");
				}
			}
		}
	}
}
