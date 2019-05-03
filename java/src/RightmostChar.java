import java.io.*;

public class RightmostChar {
	public static void main (String[] args) throws IOException {
		File file = new File(args[0]);
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		
		String line;
		while ((line = buffer.readLine()) != null) {
			line = line.trim();
	        
			if (line.length() > 0) {
				String[] strings = line.split(",");
				
				if (strings.length != 2) {
					continue;
				}
				
				String s = strings[0];
				String t = strings[1];

				int pos = s.lastIndexOf(t);
				
				System.out.println(pos);
			}
		}
	}
}
