import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;


public class MainMenu
	{
	
	public static ArrayList<Student> roster = new ArrayList<Student>();

		static Scanner userStringInput = new Scanner(System.in);
		static Scanner userIntInput = new Scanner(System.in);
		public static int classSortChoice; 
		public static int selection; 
		public static int classChoice;
		public static int choice;


		public static void main(String[] args) throws IOException
			{
			Roster.populateObjs();
			Roster.makeGPA();

				welcome();
				displayRoster();
				displayMainMenu();

			}
		
		public static void welcome()
		{
			System.out.println("Hey! Welcome to the SIS!");
			
		}
		
		public static void displayRoster() throws IOException
		{
			
			
			for (int i = 0; i < roster.size(); i++)
			{
				System.out.print(roster.get(i).getFirstName()+" "+roster.get(i).getLastName()+"		"+roster.get(i).getClass1()+" "+roster.get(i).getGrade1()+"		"+roster.get(i).getClass2()+" "+roster.get(i).getGrade2()+"		"+roster.get(i).getClass3()+" "+roster.get(i).getGrade3()+"		");
				System.out.format("%.1f", roster.get(i).getGPA());
				}
			
		}
		
		public static void displayMainMenu() throws IOException
		{
			System.out.println("What would you like to do? \n 1) Add or delete a student \n 2) Change a students grade/schedule \n 3) Sort the students");
			
			int choice = userIntInput.nextInt();
			
			switch(choice) {
			case 1:
				addDeleteMenu();
				
				break;
				
			case 2: 
				changeClassMenu();
				break;
				
			case 3:
				sortMenu();
				
			break;
				

				
				
			}
			
		}
		
		public static void changeClassMenu() {

				System.out.println("Which class do you want to change for: 1, 2, or 3");
				classChoice = userIntInput.nextInt();
				switch(classChoice) {
				case 1:
					System.out.println("Would you like to change \n 1) the student grade \n 2) the students class");
					selection = userIntInput.nextInt();
					switch(selection) {
					case 1:
						try {
							PeriodChanger.changeG1();
						} catch (IOException e) {
							e.printStackTrace();
						}
						break;
					case 2:
						try {
							PeriodChanger.changeC1();
						} catch (IOException e) {
							e.printStackTrace();
						}
					break;
					}
				case 2: 
					System.out.println("Would you like to change \n 1) the student grade \n 2) the students class");
					selection = userIntInput.nextInt();
					switch(selection) {
					case 1:
						try {
							PeriodChanger.changeG2();
						} catch (IOException e) {
							e.printStackTrace();
						}
						break;
					case 2:
						try {
							PeriodChanger.changeC2();
						} catch (IOException e) {
							e.printStackTrace();
						}
					break;		
					}
					
					case 3: 
						System.out.println("Would you like to change \n 1) the student grade \n 2) the students class");
						selection = userIntInput.nextInt();
						switch(selection) {
						case 1:
							try {
								PeriodChanger.changeG3();
							} catch (IOException e) {
								e.printStackTrace();
							}
							break;
						case 2:
							try {
								PeriodChanger.changeC3();
							} catch (IOException e) {
								e.printStackTrace();
							}
						break;		
						}				}
				
				
			}

			
	

		public static void addDeleteMenu() throws IOException
		{
			System.out.println("Would you like to (1)add or (2)delete a student?");
			int adChoice = userIntInput.nextInt();
			switch(adChoice) {
			case 1:
				editor.addStudent();
				 break;
			case 2:
				editor.deleteStudent();
				break;
			}

			
		}
		

		public static void sortMenu() throws IOException
		{
			System.out.println("How do you want to sort? \n 1) Sort by last name \n 2) Sort by GPA \n 3) Sort by class");
			
			int sortChoice = userIntInput.nextInt();
			switch(sortChoice) {
			case 1:
				Collections.sort(roster, new NameSorter());
				displayRoster();
			case 2:
				Collections.sort(roster, new GPASorter());
				displayRoster();

			case 3:
				Collections.sort(roster, new GPASorter());
				displayRoster();

			}
			
		}
		public static void printList() throws FileNotFoundException {
			Scanner scanner = new Scanner(new File("roster.txt"));
			while (scanner.hasNextLine()) {
			   System.out.println(scanner.nextLine());
			   // process the line
			}
		}
		

	
	}

