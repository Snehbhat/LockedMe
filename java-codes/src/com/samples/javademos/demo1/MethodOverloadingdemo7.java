package com.samples.javademos.demo1;

public class MethodOverloadingdemo7 {
	
	public static void main(String[] args)
	{
		calculatescore("John", 500);
		calculatescore(950);
	}
    
	public static int calculatescore(String playerName,int score)
	{
		System.out.println("Player " + playerName + "scored " + score + " points");
		return score*1000;
	}
	
	public static int calculatescore(int score)
	{
		System.out.println("Unnamed Player " + "scored " + score + " points");
		return score*1000;
	}
}
