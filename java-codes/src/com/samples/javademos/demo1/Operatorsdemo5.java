package com.samples.javademos.demo1;

public class Operatorsdemo5 {
	
	public static void main(String[] args)
	{
		int result=1+2;
		result=result*10;
		int remainder=result%4;
		System.out.println(remainder);
		result++;
		System.out.println(result);
		result--;
		System.out.println(result);
		result+=2;
		System.out.println(result);
		result/=3;
		System.out.println(result);
		
		boolean mytemp=true;
		if(mytemp)
		{
			System.out.println("Yes");
		}
		int topscore=100;
		if(topscore==100)
			System.out.println("High score");
		
		boolean myflag=false;
		if(myflag)
			System.out.println("1");
		else
			System.out.println("2");
		
		topscore=100;
		int secondtopscore=98;
		if((secondtopscore<=100) && (topscore==100))
{
	System.out.println("Great");
}
		int age=25;
		//String message=(age>20)?"Buy a Car":"Wait";
		//System.out.println(message);
		boolean iscaraval=false;
		String message=(age>20)?(iscaraval)?"Buy":"Wait for a While":"Wait";
		System.out.println(message);
	}
	
	

}
