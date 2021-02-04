import java.io.File;
import java.util.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Roster {
	
	   public static void populateObjs() throws IOException
	  	{
			Scanner file = new Scanner(new File ("StudentList.txt"));
			 
			while (file.hasNext())
			{
				MainMenu.roster.add(new Student(file.next(), file.next(), file.next(), file.next(), file.next(), file.next(), file.next(), file.next(), 0.0));
			}
	  	}
	   public static void makeGPA()
		{
		for(Object s: MainMenu.roster) {
			double gpa = 0; 
			gpa += letterConverter(((Student) s).getGrade1());
			gpa += letterConverter(((Student) s).getGrade2());
			gpa += letterConverter(((Student) s).getGrade3());
			gpa /= 3;
			((Student) s).setGPA((Math.round(gpa*100))/100.0);

		}}
	   
	   public static double letterConverter(String grade) {
		   switch(grade) {
		   case "A", "A+":
				return 4.0;
	   case "A-":
			return 3.67;
	   case "B+":
			return 3.33;
	   case "B":
			return 3.00;
	   case "B-":
			return 2.67;
	   case "C+":
			return 2.33;
	   case "C":
			return 2.00;
	   case "C-":
			return 1.67;
	   case "D+":
			return 1.33;
	   case "D":
			return 1.00;
	   case "D-":
			return 0.67;
	   case "F":
			return 0;
		   }
	   return 0;}
}
			



	