
public class SumOfPrimes {

	public static boolean isPrime(int n) {
		if (n == 2) {
			return true;
		}
		
		//check if n is a multiple of 2
		if (n % 2 == 0) {
			return false;
		}

		//if not, then just check the odds
		for (int i = 3; i * i <= n; i += 2) {
			if (n % i == 0) {
				return false;
			}
		}
	
		return true;
	}
	
	public static void main (String[] args) {
		int sum = 0;
		int nPrimes = 0;
		int num = 2;
		
		while (nPrimes < 1000) {
			if (isPrime(num)) {
				sum += num;
				nPrimes++;
				
				//System.out.println(num);
			}
			
			num++;
		}
		
		System.out.println(sum);
	}
}

