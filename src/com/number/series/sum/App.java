package com.number.series.sum;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number N: ");
		/**
		 * Acquiring the input number from the below statement
		 */
		int n = scanner.nextInt();

		/**
		 * here starts the fibonacci calculation with time elapsed
		 */
		FibonacciSeries f = new FibonacciSeries();
		long fStartTime = System.currentTimeMillis();
		long sumOfFibonacci = f.sumOfFibonacciSeries(n);
		long fStopTime = System.currentTimeMillis();
		long fTimeElapsed = fStopTime - fStartTime;
		
		System.out.println("Sum of Fibonacci numbers = " + sumOfFibonacci + ". Time taken = " + fTimeElapsed + " ms");
		
		/**
		 * Here starts the prime calculation with time elapsed
		 */
		PrimeSeries p = new PrimeSeries();
		long pStartTime = System.currentTimeMillis();
		long sumOfPrime = p.sumOfPrimeSeries(n);
		long pStopTime = System.currentTimeMillis();
		long pTimeElapsed = pStopTime - pStartTime;
		
		System.out.println("Sum of Prime numbers = " + sumOfPrime + ". Time taken = " + pTimeElapsed + " ms");
		
		/**
		 * here starts the sum of series with time elapsed
		 */
		SumSeries s = new SumSeries();
		long sStartTime = System.currentTimeMillis();
		long sumOfSeries = s.sumOfSeries(n);
		long sStopTime = System.currentTimeMillis();
		long sTimeElapsed = sStopTime - sStartTime;
		
		System.out.println("Sum of N numbers = " + sumOfSeries + ". Time taken = " + sTimeElapsed + " ms");

	}
}