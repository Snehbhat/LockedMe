package com.samples.javademos.demo1;

public class Whiledemo10 {

	public static void main(String[] args)
	{
		int count=0;
		while(count!=5)
		{
			System.out.println("count value " + count);
			count++;
		}
		
		count=9;
		do {
			System.out.println("Count value is " + count);
			count++;
		}while(count<20);
	}
	
}
