import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;


public class Fibonacci {
	public static int[] fibs = new int[200];
	
	public static void populateFibonacci(int n) {
		fibs[0] = 0;
		fibs[1] = 1;
		
		for (int i = 2; i <= n; i++) {
			fibs[i] = fibs[i - 2] + fibs[i - 1];
		}
	}
	
	
	public static void main (String[] args) throws IOException {
		File file = new File(args[0]);
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		ArrayList<Integer> nums = new ArrayList<Integer>();
		int max = 0;
		
		String line;
		while ((line = buffer.readLine()) != null) {
			line = line.trim();
	        
			if (line.length() > 0) {
				Integer val = Integer.valueOf(line);
				if (val.intValue() > max) {
					max = val.intValue();
				}
				
				nums.add(Integer.valueOf(line));
			}
		}
		
		populateFibonacci(max);
	
		for (Iterator<Integer> it = nums.iterator(); it.hasNext(); ) {
			int num = it.next().intValue();
			System.out.println(fibs[num]);
		}
		
		buffer.close();
	}
}
