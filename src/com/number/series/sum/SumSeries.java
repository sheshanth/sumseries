package com.number.series.sum;

public class SumSeries {

	public long sumOfS(int n) throws InterruptedException {
		synchronized (this) {
			long i = sumOfSeries(n);
			wait();
			return i;
		}
	}

	public long sumOfSeries(int n) {

		long sum = 0;
		for (int i = 0; i <= n; i++) {
			sum += i;
		}

		return sum;

	}

	public void res() throws InterruptedException {
		synchronized (this) {
			notify();
		}
	}
}
