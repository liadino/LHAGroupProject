
import java.util.Scanner;

public class MainMenu {
	static Scanner userStringInput = new Scanner(System.in);
	public static int classSortChoice;

	public static void main(String[] args) {
		System.out.print("What would you like to do? \n 1) Add or Delete a Student \n 2) Change Student Grades/Schedule \n 3) Sort Students"); 
		String choice = userStringInput.nextLine();
		switch (choice) 
		{
			case "1":
			{
				
	
			}
			case "2":
			{
				
			}
			case "3":
			{
				System.out.println("Would you like \n 1) Sort by Name \n 2) Sort by class \n 3) Sort by GPA");
				String sortChoice = userStringInput.nextLine();
				switch (sortChoice) 
				{
					case "1":
					{
						
			
					}
					case "2":
					{
						System.out.println("Would you like \n 1) Sort by first period \n 2) Sort by second period \n 3) Sort by third period");
						classSortChoice = userStringInput.nextInt();
						//PeriodSorter();
						//how to i call class sorter class

					}
						
					case "3":
					{
	
					}

				
			}
			
		}

	
		
		
		
		
		
		
	}

}
}