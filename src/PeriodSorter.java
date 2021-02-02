
import java.util.Comparator;

public class PeriodSorter  implements Comparator<student>
			 	
{
			 		
			 		
	public int compare(student s1, student s2)
		{
			return s1.getClass1().compareTo(s2.getClass1());
		}





}