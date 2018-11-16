package com.number.series.sum;

import java.util.Arrays;

public class PrimeSeries extends Thread {

	private long sum;
	private long eTime;
	private int n;
	
	public long getSum() {
		return sum;
	}

	public long geteTime() {
		return eTime;
	}
	
	public long sumOfPrimeSeries(int n) {
		
        boolean prime[]=new boolean[n + 1]; 
    
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
	
	@Override
	public void run() {
		long pStartTime = System.currentTimeMillis();
		sum = sumOfPrimeSeries(n);
		long pStopTime = System.currentTimeMillis();
		long pTimeElapsed = pStopTime - pStartTime;
	}
	
}
