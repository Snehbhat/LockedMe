package com.samples.javademos.demo1;

public class Fordemo9 {

	public static void main(String[] args)
	{
		
		//for(int i=0;i<5;i++)
		//{
		//	System.out.println("Loop " + i + " Hello");
		//}
		int count=0;
		for(int i=10;i<=40;i++)
		{
			if(isPrime(i))
			
			{
				count++;
				System.out.println(i);
			}
			
		}
		System.out.println("Total number of prime numbers " + count);
		
		
	}
	public static boolean isPrime(int n)
	
	{
		if(n==1)
			return false;
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
				return false;
		}
		return true;
	}
}
