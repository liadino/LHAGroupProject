
import java.util.Collections;
import java.util.Scanner;

public class MainMenu {
	static Scanner userStringInput = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("What would you like to do? \n 1) Add a Student  \n 2) Delete a Student \n 3) Change Student Grades/Schedule \n 4) Sort Students"); 
		String choice = userStringInput.nextLine();
		
		switch (choice) 
		{
			case "1":
			{
				Scanner Input = new Scanner(System.in);
				System.out.println("who do you want to add?");
				break;
			}
		
			case "2":
			{
				Scanner Input = new Scanner(System.in);
				System.out.println("who do you want to delete?");
				break;
			}
			
				case "3":
				{
					Scanner Input = new Scanner(System.in);
					System.out.println("do you want to \n 1) change a students grade \n 2) change a students schedule?");
					
					if (Input.equals("1"))
					{
						System.out.println("whos grade do you want to change?");
					}
					
					else if (Input.equals("2"))
					{
						System.out.println("whos schedule do you want to change ");
					}
					break;
				}
			
				case "4":
				{
					Scanner Input = new Scanner(System.in);
				
					System.out.println("how do you wanto to sort \n 1) by name \n 2) by \n Gpa 3) by period");
					if (Input.equals("1"))
					{
						Collections.sort(Array.roster, new NameSorter());
					}
					
					else if (Input.equals("2"))
					{
						Collections.sort(Array.roster, new GPASorter());
					}
					
					else if (Input.equals("3"))
					{
						Collections.sort(Array.roster, new PeriodSorter());
					}
					break;
					
				}
			
			
		}

	
		
		
		
		
		
		
	}

}