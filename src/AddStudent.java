import java.util.*;
import java.io.*;
public class AddStudent {
public static void addRemove() {	
	Scanner inp = new Scanner(System.in);
	System.out.println("Would you like to 1. add a student or 2. remove a student? type the correspoding number" );
	String answer = inp.nextLine();
	if (answer.equals("1"))
    {
      System.out.println("You chose to add a student.");
      
    }
  else if (answer.equals("2"))
    {
      System.out.println("Moms secret recipe.");
    }
  else
    {
    System.out.println("Please choose a number.");
    }
}
public static void addingStudent() {
	Scanner inp2 = new Scanner(System.in);
	System.out.println("Add the first and last name with capitals." );
	System.out.println("e.g Daniel Andrews" );
	String name = inp2.nextLine();
	Scanner inp3 = new Scanner(System.in);
	System.out.println("Add the first class and capitalize it" );
	System.out.println("e.g Biology" );
	String period1 = inp3.nextLine();
	Scanner inp4 = new Scanner(System.in);
	System.out.println("Add the grade that goes along with this class" );
	System.out.println("e.g B+" );
	String grade1 = inp4.nextLine();
	Scanner inp5 = new Scanner(System.in);
	System.out.println("Add the second class and capitalize it" );
	System.out.println("e.g Biology" );
	String period2 = inp5.nextLine();
	Scanner inp6 = new Scanner(System.in);
	System.out.println("Add the grade that goes along with this class" );
	System.out.println("e.g B+" );
	String grade2 = inp6.nextLine();
	Scanner inp7 = new Scanner(System.in);
	System.out.println("Add the third class and capitalize it" );
	System.out.println("e.g Biology" );
	String period3 = inp7.nextLine();
	Scanner inp8 = new Scanner(System.in);
	System.out.println("Add the grade that goes along with this class" );
	System.out.println("e.g B+" );
	String grade3 = inp8.nextLine(); 
    
	ArrayList<String> npg = new ArrayList<String>();  
    npg.add(name); 
    npg.add(period1); 
    npg.add(grade1);
    npg.add(period2); 
    npg.add(grade2);
    npg.add(period3); 
    npg.add(grade3);
 
    System.out.println("ArrayList : " + npg);
    //hi
}
}

