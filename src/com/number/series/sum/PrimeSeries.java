package com.number.series.sum;

import java.util.Arrays;

public class PrimeSeries extends Thread {


	public long sumOfP(int n) throws InterruptedException {
		//synchronized (this) {
			long i = sumOfPrimeSeries(n);
			//wait();
			return i;
		//}
	}

	public long sumOfPrimeSeries(int n) {

		boolean prime[] = new boolean[n + 1];

		Arrays.fill(prime, true);

		for (int p = 2; p * p <= n; p++) {

			if (prime[p] == true) {
				for (int i = p * 2; i <= n; i += p)
					prime[i] = false;
			}
		}

		long sum = 0;
		for (int i = 2; i <= n; i++)
			if (prime[i])
				sum += i;

		return sum;

	}

	/*public void res() throws InterruptedException {
		synchronized (this) {
			notify();
		}
	}*/
	

}
