package com.samples.javademos.demo1;

import java.util.Scanner;

public class UserInputdemo11 {
	
	public static void main(String[] args)
	{
		Scanner scanner= new Scanner(System.in);
		//scanner.nextLine();
		System.out.println("Enter the name");
		String name=scanner.nextLine();
		System.out.println("Name entered " + name);
		scanner.close();
	}

}
