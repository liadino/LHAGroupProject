import java.util.Comparator;

public class NameSorter  implements Comparator<student>
			 	{
	public int compare(student s1, student s2) {
		return s1.getLastName().compareTo(s2.getLastName());
	}





	}