import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class DetectingCycles {
	public static int findNext(String[] array, int start, String val) {
		int i = start + 1;
		while (i < array.length) {
			if (val.equals(array[i])) {
				break;
			}
		
			i++;
		}
	
		if (i == array.length) {
			return -1;
		}
		
		return i;
	}
	
	public static void main (String[] args) throws IOException {
		File file = new File(args[0]);
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		
		String line;
		while ((line = buffer.readLine()) != null) {
			line = line.trim();
			
			System.out.println("Processing line [" + line + "]");
	        
			if (line.length() > 0) {
				String[] nums = line.split(" ");
				
				for (int i = 0; i < nums.length; i++) {
					String num = nums[i];
					int nextIndex = findNext(nums, i, num);
					
					if (nextIndex > -1) {
						System.out.println("Next index of [" + num + "] is: " + nextIndex);
					}
				}
			}
		}
		
		buffer.close();
	}
}
