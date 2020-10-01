 
public class powersum{  
	static int countfunc(int x, int n, int num) 
	{ 
		// Base cases 
		int val = (int) (x - Math.pow(num, n)); 
		if (val == 0) 
			return 1; 
		if (val < 0) 
			return 0; 
	
		return countfunc(val, n, num + 1) + 
			countfunc(x, n, num + 1); 
	} 
	
	// Returns number of ways  
	static int count(int x, int n) 
	{ 
		return countfunc(x, n, 1); 
	} 
	
	// Driver code 
	public static void main(String args[]) 
	{ 
		int x = 100, n = 2; 
		System.out.println(countWays(x, n)); 
	} 
} 
 
