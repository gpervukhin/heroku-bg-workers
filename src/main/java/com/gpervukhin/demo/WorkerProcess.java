package com.gpervukhin.demo;

public class WorkerProcess {

	public static void main(String[] args)
	{
		while (true)
		{
			System.out.println("***** HI: Worker process woke up for a moment");
			
			try { Thread.sleep(60000); }
			catch (InterruptedException e) {}
		}
	}
}