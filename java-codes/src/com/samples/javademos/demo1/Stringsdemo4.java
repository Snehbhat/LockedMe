package com.samples.javademos.demo1;

public class Stringsdemo4 {
	
	public static void main(String[] args)
	{
		String s1= "Hello";
		
		String s2= s1 + "World";
		
		String s3= "95";
		
		int myint=Integer.parseInt(s3);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		int x=10;
		 s2=s1+x;
		 System.out.println(s2);
		 
		 double doublenumber=29d;
		 String mystrdouble= "Hello" + doublenumber;
		 System.out.println("mystr double= " + mystrdouble);
		 
		function1();
		System.out.println(myint);
	}
	static void function1()
	{
		String s4= "45x";
		try {
			 int myint=Integer.parseInt(s4);
			 }
			 catch(NumberFormatException nfe)
			 {
				 System.out.println("Number format exception occured");
				 throw nfe;
			 }
		
			 catch (Exception ex)
			 {
				 System.out.println("Failed to read user input" +ex.getMessage());
			 }
			
	}

}
