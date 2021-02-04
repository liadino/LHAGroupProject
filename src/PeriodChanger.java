import java.util.Scanner;
import java.io.IOException;


public class PeriodChanger {
	static Scanner userStringInput = new Scanner(System.in);
	public static int choice;

	
public static void getChoice() throws IOException
{
	System.out.println("What student would you like to edit?");
	Object studentChoice = userStringInput.nextLine();
	String [] nameSplit = ((String) studentChoice).split(" ");
	for(int i = 0; i < MainMenu.roster.size(); i++)
	{
		if(MainMenu.roster.get(i).getFirstName().equals(nameSplit[0]) && MainMenu.roster.get(i).getLastName().equals(nameSplit[1]))
		{
			choice = i;
		}
	}
}


	public static void changeC1() throws IOException	
	{
		getChoice();
		System.out.println("what would you like to change their  class to?");
		Scanner Input2 = new Scanner(System.in);
		String newClass = Input2.nextLine();
		MainMenu.roster.get(choice).setClass1(newClass);
		MainMenu.displayRoster();


	}

	public static void changeC2()throws IOException	
	{
		getChoice();

		System.out.println("what would you like to change their class to?");
		Scanner Input2 = new Scanner(System.in);
		String newClass = Input2.nextLine();
		MainMenu.roster.get(choice).setClass2(newClass);
		MainMenu.displayRoster();


	}


	public static void changeC3()	throws IOException
	{
		getChoice();

		System.out.println("what would you like to change their class to?");
		Scanner Input2 = new Scanner(System.in);
		String newClass = Input2.nextLine();
		MainMenu.roster.get(choice).setClass3(newClass);
		MainMenu.displayRoster();


	}

	public static void changeG1()throws IOException
	{
		getChoice();

		System.out.println("what would you like to change their grade to?");
		Scanner Input2 = new Scanner(System.in);
		String newGrade = Input2.nextLine();
		MainMenu.roster.get(choice).setGrade1(newGrade);
		MainMenu.displayRoster();

	}



	public static void changeG2()throws IOException
	{
		getChoice();

		System.out.println("what would you like to change their grade to?");
		Scanner Input2 = new Scanner(System.in);
		String newGrade = Input2.nextLine();
		MainMenu.roster.get(choice).setGrade2(newGrade);
		MainMenu.displayRoster();





		}


	public static void changeG3()throws IOException
	{
		
		System.out.println("what would you like to change their grade to?");
		Scanner Input2 = new Scanner(System.in);
		String newGrade = Input2.nextLine();
		MainMenu.roster.get(choice).setGrade3(newGrade);
		MainMenu.displayRoster();
		MainMenu.displayRoster();

	}

		}

