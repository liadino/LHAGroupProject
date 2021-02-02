
import java.util.Comparator;

public class PeriodSorter  implements Comparator<Student>
			 	{
	public int compare(Student s1, Student s2) {
		if(MainMenu.classSortChoice == 1) 
			return s1.getClass1().compareTo(s2.getClass1());
		
		else if(MainMenu.classSortChoice == 2) 
			return s1.getClass2().compareTo(s2.getClass2());
		
		else 
			return s1.getClass3().compareTo(s2.getClass3());
					
	}


	}


