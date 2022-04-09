package LockedMe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WelcomeToMyProject {
	
	static ArrayList<String> Arr= new ArrayList<>();
	
	public static void main(String[] args)
	{
		Arr.add("Albums");
		Arr.add("Flowers");
		Arr.add("Juices");
		Arr.add("Vegetables");
		Arr.add("Songs");
		
		welcome();
	}
	  private static void welcome()
	  {
		  System.out.println("Welcome to Lockedme.com");
		  System.out.println("Developed By Sneh Bhat");
		  System.out.println("1.Current Files");
		  System.out.println("2.More Options");
		  System.out.println("3.Close");
		  System.out.println("4.Enter options");
		  
		  EnterOptions();
	  }
	  
	  public static void EnterOptions()
	  {
		  Scanner s=new Scanner(System.in);
		  int n=s.nextInt();
		  switch(n)
		  {
		  case 1: DisplayFiles();
		  break;
		  case 2: EntireListOfFileOperations();
		  break;
		  case 3: close();
		  break;
		  default: System.out.println("Invalid Input");
		  EnterOptions();
		  }  
	  }
	  private static void EntireListOfFileOperations()
	  {
		  System.out.println("1.Add Files");
		  System.out.println("2.Delete Files");
		  System.out.println("3.Search Files");
		  System.out.println("4.Back");
		  System.out.println("Enter the option");
		  Scanner sc=new Scanner(System.in);
		  int num= sc.nextInt();
		  switch(num)
		  {
		  case 1: addFile();
		  break;
		  case 2: deleteFile();
		  break;
		  case 3: searchFile();
		  break;
		  case 4: welcome();
		  break;
		  default: System.out.println("Invalid Input");
		  EntireListOfFileOperations();
		  }
	  }
	  public static void searchFile()
	  {
		  Scanner x=new Scanner(System.in);
		  String y=x.nextLine();
		  if(Arr.contains(y))
		  {
			  System.out.println("File " + y + " found");
		  }
		  else
			  System.out.println("File " + y + " Not Found");
			System.out.println("Press 1 to go back and press 2 to close");
			int a=x.nextInt();
			switch(a)
			{
			case 1: welcome();
			break;
			case 2: close();
			}
	  }
	  private static void deleteFile()
	  {
		  Scanner f=new Scanner(System.in);
		  System.out.println("Enter the file which you want to delete");
		  String a=f.nextLine();
		  if(Arr.contains(a))
		  {
			  Arr.remove(a);
			  System.out.println(a + "Is Deleted");
		  }
		  else
			  System.out.println("File Not Found");
		  System.out.println("Press 1 to display files or Press 2 to close");
		  int en=f.nextInt();
		  switch(en)
		  {
		  case 1: DisplayFiles();
		  break;
		  case 2: close();
		  break;
		  }
	  }
	  private static void addFile()
	  {
		  System.out.println("Enter File Name");
		  Scanner b=new Scanner(System.in);
		  String ad=b.next();
		  Arr.add(ad);
		  System.out.println("Press 1 to display files or press 2 to close");
		  Scanner c= new Scanner(System.in);
		  int a=c.nextInt();
		  switch(a)
		  {
		  case 1: DisplayFiles();
		  break;
		  case 2: close();
		  break;
		  }
	  }
	  private static void close()
	  {
		  System.out.println("This application is Closed Thank You");
		  System.exit(0);
	  }
	  private static void DisplayFiles()
	  {
		  Collections.sort(Arr);
		  System.out.println("Entire list of the files");
		  for(int i=0;i<Arr.size();i++)
		  {
			  System.out.println(Arr.get(i));	  
		  }
		  System.out.println("Press 1 to return Back");
		  Scanner sc= new Scanner(System.in);
		  int en=sc.nextInt();
		  switch(en)
		  {
		  case 1: welcome();
		  break;
		  default: System.out.println("Invalid Input");
		  DisplayFiles();
		  }
	  }
}
