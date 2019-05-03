import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class MultiplyLists {
	public static void main (String[] args) throws IOException {
		File file = new File(args[0]);
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		
		String line;
		while ((line = buffer.readLine()) != null) {
			line = line.trim();
	        
			//System.out.println("line is [" + line + "]");
			
			if (line.length() > 0) {
				String[] lists = line.split("\\|");
				//System.out.println("lists0 is [" + lists[0] + "], lists1 is [" + lists[1] + "]");
				
				String[] numbers1 = lists[0].trim().split(" ");
				String[] numbers2 = lists[1].trim().split(" ");
				
				//System.out.println("lists0 is [" + lists[0] + "], lists1 is [" + lists[1] + "]");
				
				for (int i = 0; i < numbers1.length; i++) {
					int prod = Integer.parseInt(numbers1[i]) * Integer.parseInt(numbers2[i]);
					
					if (i == 0) {
						System.out.print(prod);
					} else {
						System.out.print(" " + prod);
					}
				}

				System.out.println();
				
			}
		}
	}
}
