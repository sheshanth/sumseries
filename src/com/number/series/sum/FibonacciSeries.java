package com.number.series.sum;

public class FibonacciSeries extends Thread {

	public long sumOfF(int n) throws InterruptedException {
		//synchronized (this) {
			long i = sumOfFibonacciSeries(n);
			//wait();
			return i;
		//}
	}

	public long sumOfFibonacciSeries(int n) throws InterruptedException {

		if (n <= 0)
			return 0;
		Thread.sleep(5000);
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

	/*public void res() throws InterruptedException {
		synchronized (this) {
			notify();
		}
	}*/

}
