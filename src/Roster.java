import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Roster {
	 int test = 1;

	static ArrayList<Object> roster = new ArrayList<Object>();
	
	   public static void populateObjs() throws IOException
	  	{
		   int counter = 0;
		   Scanner file = new Scanner( new File( "StudentList.txt" ) );
		
		   while(file.hasNextLine()) 
		   {
			   counter++;
			   
			  roster.add(new Student(file.next() , file.next(), file.next() , file.next(), file.next() , file.next(), file.next() , file.next(), 0));
		   }
	  	}
	   public static void makeGPA()
		{
		for(Object s: roster) {
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
			



	