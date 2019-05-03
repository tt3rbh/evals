import java.io.*;


public class UniqueElements {
	public static void main (String[] args) throws IOException {
		File file = new File(args[0]);
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		
		String line;
		while ((line = buffer.readLine()) != null) {
			String[] nums = line.split(",");
		
			int cur = -1;
			for (int i = 0; i < nums.length; i++) {
				if (i == 0) {
					cur = Integer.parseInt(nums[i]);
					System.out.print(cur);
				} else {
					int nxt = Integer.parseInt(nums[i]);
					if (cur != nxt) {
						cur = nxt;
						System.out.print("," + cur);
					}
				}
			}
			
			System.out.println();
		}
	}
}
