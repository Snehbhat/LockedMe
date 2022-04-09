package com.samples.javademos.demo1;

public class Methodsdemo6 {
	
	public static void main(String[] args)
	{
		/*String playerName="John";
		int score=800;
		int levelcompleted=5;
		int bonus=100;
		boolean gameover=true;
		if(gameover)
		{
			int finalscore= score+levelcompleted*100;
			System.out.println("Player " + playerName + ",your final score is " + finalscore);
		}*/
		
		calculatescore("John", 800,4,100,true);
		calculatescore("Max", 700,4,100,true);
		calculatescore("William", 1800,7,100,true);
		
	}
	public static void calculatescore(String playerName,int score,int levelcompleted,int bonus,boolean gameover)
	{
		int finalscore= score+levelcompleted*100;
		System.out.println("Player " + playerName + ",your final score is " + finalscore);
	}

}
