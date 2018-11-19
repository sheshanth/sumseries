package com.number.series.sum;

import java.util.Scanner;

public class App {

	public static void main(String[] args) throws InterruptedException {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number N: ");
		int n = scanner.nextInt();

		/**
		 * Instance of all the Series class are created
		 */

		FibonacciSeries f1 = new FibonacciSeries();
		PrimeSeries p1 = new PrimeSeries();
		SumSeries s1 = new SumSeries();
		
		/**
		 * here starts the fibonacci calculation with time elapsed
		 */
		Thread tF = new Thread(new Runnable() {

			@Override
			public void run() {
				try {

					long fStartTime = System.currentTimeMillis();
					long sumOfFibonacci = f1.sumOfF(n);
					long fStopTime = System.currentTimeMillis();
					long fTimeElapsed = fStopTime - fStartTime;

					System.out.println(
							"Sum of Fibonacci numbers = " + sumOfFibonacci + ". Time taken = " + fTimeElapsed + " ms");

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
					long sumOfPrime = p1.sumOfP(n);
					long pStopTime = System.currentTimeMillis();
					long pTimeElapsed = pStopTime - pStartTime;

					System.out
							.println("Sum of Prime numbers = " + sumOfPrime + ". Time taken = " + pTimeElapsed + " ms");

				} catch (Exception e) {
					e.printStackTrace();
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
					long sumOfSeries = s1.sumOfS(n);
					long sStopTime = System.currentTimeMillis();
					long sTimeElapsed = sStopTime - sStartTime;

					System.out.println("Sum of N numbers = " + sumOfSeries + ". Time taken = " + sTimeElapsed + " ms");

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

		tF.start();
		tP.start();
		tS.start();

		Thread tFF = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					f1.res();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
		});

		Thread tPP = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					p1.res();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
		});

		Thread tSS = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					s1.res();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
		});

		tFF.start();
		tPP.start();
		tSS.start();

	}
}