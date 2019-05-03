import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class SetIntersection {
	
	public static boolean inSet(String s, String[] set) {
		for (int i = 0; i < set.length; i++) {
			if (s.equals(set[i])) {
				return true;
			}
		}
		
		return false;
	}
	
	public static void main (String[] args) throws IOException {
		File file = new File(args[0]);
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		
		String line;
		while ((line = buffer.readLine()) != null) {
			line = line.trim();
	        String[] sets = line.split(";");
	        
	        String[] set1 = sets[0].split(",");
	        String[] set2 = sets[1].split(",");
	        
	        StringBuffer sb = new StringBuffer();
	        
	        for (int i = 0; i < set1.length; i++) {
	        	if (inSet(set1[i], set2)) {
	        		if (sb.length() == 0) {
	        			sb.append(set1[i]);
	        		} else {
	        			sb.append("," + set1[i]);
	        		}
	        	}
	        }

	        System.out.println(sb.toString());
		}
		
		buffer.close();
	}
}
