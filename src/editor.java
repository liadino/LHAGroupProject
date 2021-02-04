import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
public class editor 
{
	static Scanner userStringInput = new Scanner(System.in);
	public static String firstName;
	public static String lastName;




public static void addStudent() throws IOException
{
	System.out.println("Please enter the first and last name");
	String name = userStringInput.nextLine();

	String [] name2 = name.split(" ");

	firstName = name2[0];
	lastName = name2[1];
	MainMenu.roster.add(new Student(firstName, lastName, "Default Period 1", "Default Grade 1","Default Period 2", "Default Grade 2","Default Period 3", "Default Grade 3",0.0));
	System.out.println("Your new student has been added. They have been assigned default periods and grades that you can change later.");
	MainMenu.displayRoster();
}


public static void deleteStudent() throws IOException 
{

		System.out.println("Please enter the student's name in which you want to delete");
		
		MainMenu.printList();


		String name = userStringInput.nextLine();
		
		String [] name2 = name.split(" ");
		
		for(int i = 0; i < MainMenu.roster.size(); i++)
		{
			if(MainMenu.roster.get(i).getFirstName().equals(name2[0]) && MainMenu.roster.get(i).getLastName().equals(name2[1]))
			{
				MainMenu.roster.remove(i);
			}
		}
		
		System.out.println(name + " has been deleted");
		
		MainMenu.displayRoster();
		

	}


}