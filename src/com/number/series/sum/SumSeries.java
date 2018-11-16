package com.number.series.sum;

public class SumSeries {
	public long sumOfSeries(int n) {
		long sum=0;
		for (int i = 0;i <= n;i++) {
			sum+=i;
		}
		return sum;
	}
}
