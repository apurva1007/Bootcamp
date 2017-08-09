class CheckPrime {
	
	public int isPrime(int n) {
		
		if (n == 2)
			return 1;
		
		for (int i = 2; i <= n/2; n++) {
			
			if(n%i == 0)
				return 0;
		}
		
		return 1;
	}
	
	public void generatePrimes(int m) {
		for (int i = 2; i <= m; i++) {
				int rs = 0;
				rs = isPrime(i);
				if(rs == 1)
					System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		
		CheckPrime check = new CheckPrime();
		check.generatePrimes(n);
	}
}

	
	
		
		