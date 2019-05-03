import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class DiscountOffers {
	public static float[][] combos;
	public static float max = 0.0f;
	
	
	public static int countVowels(String s) {
		int cnt = 0;
		
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'y') {
				cnt++;
			}
		}
		
		return cnt;
	}
	
	
    public static boolean commonFactors(int p, int q) {
    	int count = 0;
    	
    	if (p > q) {
    		for (int i = q; i <  p; i++) {
    			if ((q % i == 0) && (p % i == 0)) {
    				count++;
    			}
    		}
    	} else if (q > p) {
    		for (int i = p; i < q; i++) {
    			if (( p % i == 0) && (q % i == 0)) {
    				count++;
    			}
    		}
    	} else {
    		count = 2;
    	}
    	
    	if (count > 1) {
    		return true;
    	} else {
    		return false;
    	}
    }
	
	
    public static void findMax() {
    	
    	
    	
    }
    
    
	public static void main (String[] args) throws IOException {
		File file = new File(args[0]);
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		
		String line;
		while ((line = buffer.readLine()) != null) {
			line = line.trim();
			
			System.out.println("Processing line [" + line + "]");
	        
			if (line.length() > 0) {
				String[] vals = line.split(";");
				String[] customers = vals[0].split(",");
				String[] products = vals[1].split(",");
				
				combos = new float[customers.length][products.length];
				
				// Calculate the possible SS values for each combination
				for (int i = 0; i < customers.length; i++) {
					String customer = customers[i].toLowerCase();
					
					int vowels = countVowels(customer);
					int consonants = customer.length() - vowels;
					
					for (int j = 0; j < products.length; j++) {
						float ss = 0.0f;
						
						if ((products[j].length() % 2) == 0) {
							ss = vowels * 1.5f;
						} else {
							ss = consonants;
						}

						if (commonFactors(customer.length(), products[j].length())) {
							ss *= 1.5f;
						}
						
						combos[i][j] = ss;
						
						System.out.print(ss + " ");
					}
					
					System.out.println();
				}
			}
		}
		
		buffer.close();
	}
}
