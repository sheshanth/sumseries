package com.number.series.sum;

public class FibonacciSeries extends Thread{
	
	private long sum;
	private long eTime;
	
	public long getSum() {
		return sum;
	}

	public long geteTime() {
		return eTime;
	}
	
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
	
	@Override
	public void run() {
		long fStartTime = System.currentTimeMillis();
		sum = sumOfFibonacciSeries(n);
		long fStopTime = System.currentTimeMillis();
		eTime = fStopTime - fStartTime;
	}
	
}
