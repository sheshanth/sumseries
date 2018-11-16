package com.number.series.sum;

import java.util.Scanner;

public class App {
	public static void main(String[] args) throws InterruptedException {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number N: ");
		/**
		 * Acquiring the input number from the below statement
		 */
		final int n = scanner.nextInt();
		
		/**
		 * Instance of all the Series class are created
		 */

		FibonacciSeries f = new FibonacciSeries();
		PrimeSeries p = new PrimeSeries();
		SumSeries s = new SumSeries();
		
		/**
		 * here starts the fibonacci calculation with time elapsed
		 */
		Thread tF = new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					long fStartTime = System.currentTimeMillis();
					long sumOfFibonacci = f.sumOfFibonacciSeries(n);
					long fStopTime = System.currentTimeMillis();
					long fTimeElapsed = fStopTime - fStartTime;
					System.out.println("Sum of Fibonacci numbers = " + sumOfFibonacci + ". Time taken = " + fTimeElapsed + " ms");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		
		
		/**
		 * Here starts the prime calculation with time elapsed
		 */
		Thread tP = new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					long pStartTime = System.currentTimeMillis();
					long sumOfPrime = p.sumOfPrimeSeries(n);
					long pStopTime = System.currentTimeMillis();
					long pTimeElapsed = pStopTime - pStartTime;
					System.out.println("Sum of Prime numbers = " + sumOfPrime + ". Time taken = " + pTimeElapsed + " ms");
				} catch (Exception e) {
					
				}
			}
		});
		
		
		/**
		 * here starts the sum of series with time elapsed
		 */
		Thread tS = new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					long sStartTime = System.currentTimeMillis();
					long sumOfSeries = s.sumOfSeries(n);
					long sStopTime = System.currentTimeMillis();
					long sTimeElapsed = sStopTime - sStartTime;
					System.out.println("Sum of N numbers = " + sumOfSeries + ". Time taken = " + sTimeElapsed + " ms");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		/*System.out.println("Sum of Fibonacci numbers = " + sumOfFibonacci + ". Time taken = " + fTimeElapsed + " ms");
		System.out.println("Sum of Prime numbers = " + sumOfPrime + ". Time taken = " + pTimeElapsed + " ms");
		System.out.println("Sum of N numbers = " + sumOfSeries + ". Time taken = " + sTimeElapsed + " ms");*/

	}
}