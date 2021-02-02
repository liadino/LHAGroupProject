
import java.util.Comparator;

public class PeriodSorter  implements Comparator<student>
			 	{
	public static void classSorter() {
	public int compare(student s1, student s2) {
		if(MainMenu.classSortChoice == 1) return s1.getClassP1().compareTo(s2.getClassP1());
		else if(MainMenu.classSortChoice == 2) return s1.getClassP2().compareTo(s2.getClassP2());
		else return s1.getClassP3().compareTo(s2.getClassP3());
					
		}
		return s1.getClass1().compareTo(s2.getClass1());
		//if statements for each period?
		//is it organizing the kids into the classes they share?
	}
			 	}


