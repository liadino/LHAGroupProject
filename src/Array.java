import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Array {
	static ArrayList<Object> roster = new ArrayList<Object>();
	
	   public static void populateObjs() throws IOException
	  	{
		   int counter = 0;
		   //create a new Scanner connected to the data file - file.dat
		   Scanner file = new Scanner( new File( "StudentList.txt" ) );
	   	//runs through each line of text 
		
		   while(file.hasNextLine()) 
		   {
			   counter++;
			   
			  roster.add(new student(file.next() , file.next(), file.next() , file.next(), file.next() , file.next(), file.next() , file.next()));
		   }
	  	}



}
