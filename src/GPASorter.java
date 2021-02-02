import java.util.Comparator;

public class GPASorter implements Comparator<student>
{


	public int compare(student s1, student s2) {
		return s1.getGPA().compareTo(s2.getGPA());
		//figure out how to calculate GPA
	}



}
