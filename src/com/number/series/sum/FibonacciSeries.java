package com.number.series.sum;

public class FibonacciSeries {
	
	public long sumOfFibonacciSeries(int n) {
		if (n <= 0)
			return 0;
		
		int fibo[] = new int[n + 1];
		fibo[0] = 0;
		fibo[1] = 1;

		long sum = fibo[0] + fibo[1];

		for (int i = 2; i <= n; i++) {
			fibo[i] = fibo[i - 1] + fibo[i - 2];
			sum += fibo[i];
		}

		return sum;
	}
	
}
